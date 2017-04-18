package com.baeldung.service;

import java.util.Map;

/**
 * Created by hossaindoula on 4/19/2017.
 */
public interface UserDetailsService {
    Map<String, Object> save(Map<String, Object> user) throws Exception;
}
