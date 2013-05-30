/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.supmarket.dao;

import javax.ejb.Local;

/**
 *
 * @author schatteleyn
 */
@Local
public interface UserDao {
    Boolean login(String email, String password);
}
