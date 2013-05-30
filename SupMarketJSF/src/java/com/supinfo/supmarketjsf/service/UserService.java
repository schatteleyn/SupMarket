/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.supmarketjsf.service;

import com.supinfo.supmarketjsf.entity.User;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author schatteleyn
 */
@Stateless
public class UserService {
    
    @PersistenceContext
    private EntityManager em;
    
    private static String encode(String password, String algorithm) throws NoSuchAlgorithmException {
        byte[] hash = null;
        MessageDigest md = MessageDigest.getInstance(algorithm);
        hash = md.digest(password.getBytes());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < hash.length; ++i) {
        String hex = Integer.toHexString(hash[i]);
            if (hex.length() == 1) {
                sb.append(0);
                sb.append(hex.charAt(hex.length() - 1));
            } else {
                sb.append(hex.substring(hex.length() - 2));
            }
        }
        return sb.toString();
    }
    
    public User authenticate(final String email, final String password) throws NoSuchAlgorithmException {
        final String passwordHashed = encode(password, "MD5");

        return authenticateApi(email, passwordHashed);
    }
    
    public User authenticateApi(final String email, final String password) {
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<User> query = criteriaBuilder.createQuery(User.class);
        Root<User> userRoot = query.from(User.class);
        query.where(
                criteriaBuilder.equal(userRoot.get("email"), email),
                criteriaBuilder.equal(userRoot.get("password"), password)
        );

        try {
            return em.createQuery(query).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public User getById(final Long id) {
        return em.find(User.class, id);
    }
}
