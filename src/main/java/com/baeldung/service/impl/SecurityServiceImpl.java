package com.baeldung.service.impl;

import com.baeldung.service.SecurityService;

import java.util.Map;

/**
 * Created by tasnim on 4/19/2017.
 */
public class SecurityServiceImpl implements SecurityService {

    @Override
    public Map<String, Object> save(Map<String, Object> authority) throws Exception {
        if(!authority.get("id").equals(1)){
            throw new Exception("It should be one!");
        }
        return authority;
    }
}
