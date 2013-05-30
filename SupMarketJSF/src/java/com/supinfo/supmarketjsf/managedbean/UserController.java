/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.supmarketjsf.managedbean;

import com.supinfo.supmarketjsf.entity.User;
import com.supinfo.supmarketjsf.service.UserService;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 *
 * @author schatteleyn
 */
@ManagedBean
@RequestScoped
public class UserController {

    @EJB
    private UserService userService;

    private User user;
    
    public UserController() {
    }
    
    public String authenticateUser() throws NoSuchAlgorithmException {
        user = userService.authenticate(user.getEmail(), user.getPassword());
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user", user);
        if(user == null) {
            return "";
        } else {
            return "./all.xhtml?faces-redirect=true";
        }
    }

    public String logout() throws IOException {
        setUser(null);
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        externalContext.getSessionMap().clear();
        externalContext.redirect(getLoginPage());
        return "";
    }

    public String getLoginPage() {
        return FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath() + "/faces/login.jsf";
    }
    
    public User getUser() {
        if(user == null) {
            user = new User();
        }
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
