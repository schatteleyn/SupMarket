/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.supmarket.dao.jpa;

import com.supinfo.supmarket.dao.UserDao;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author schatteleyn
 */
@Stateless
public class JpaUserDao implements UserDao {
    
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
    
    @Override
    public Boolean login(String email, String password) {
        Boolean bool = false;
        String queryString = "";
        try {
            queryString = "SELECT * FROM users WHERE email='" + email + "' AND password='" + encode(password, "MD5") + "'";
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        if (!em.createQuery(queryString).getResultList().isEmpty()) {
            bool = true;
        }
        return bool;
    }
}
