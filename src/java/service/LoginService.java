/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import models.User;

/**
 *
 * @author octov
 */
public class LoginService {
    
    public User login(String username, String password){
        
        if( username.equals("abe") || username.equals("barb") && password.equals("pass")){
            User user = new User(username, null);
            return user;
        }
        
        return null;
        
    }
    
    
}
