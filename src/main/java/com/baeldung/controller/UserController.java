package com.baeldung.controller;

import com.baeldung.service.SecurityService;
import com.baeldung.service.UserDetailsService;

import java.util.Map;

/**
 * Created by hossaindoula on 4/19/2017.
 */
public class UserController {
    private UserDetailsService userDetailsService;
    private SecurityService securityService;

    public UserController(SecurityService securityService) {
        this.securityService = securityService;
    }

    public void setUserDetailsService(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    public Map<String, Object> saveUser(Map<String, Object> user) throws Exception {
        return userDetailsService.save(user);
    }

    public Map<String, Object> saveAuthority(Map<String, Object> authority) throws Exception {
        return securityService.save(authority);
    }
}
