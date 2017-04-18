package com.baeldung.service;

import java.util.Map;

/**
 * Created by tasnim on 4/19/2017.
 */
public interface SecurityService {
    Map<String, Object> save(Map<String, Object> authority) throws Exception;
}
