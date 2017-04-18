package com.baeldung.service.impl;

import com.baeldung.service.UserDetailsService;

import java.util.Map;

/**
 * Created by hossaindoula on 4/19/2017.
 */
public class UserDetailsServiceImpl implements UserDetailsService {

    @Override
    public Map<String, Object> save(Map<String, Object> user) throws Exception {
        if(!user.get("id").equals(1)){
            throw new Exception("It should be one!");
        }
        return user;
    }
}
