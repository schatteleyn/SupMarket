/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.supmarket.service;

import com.supinfo.supmarket.dao.UserDao;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author schatteleyn
 */
@Stateless
public class UserService {
    @EJB
    private UserDao userDao;
    
    public Boolean login(String email, String password) {
        return userDao.login(email, password);
    }
}
