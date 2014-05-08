package com.zhaodong8701.mockitoDemo;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Dong Zhao
 * Date: 2014/5/8
 * Time: 14:28
 */
@Component
public class Cache {
    Map<String, String> cache = new HashMap<String, String>();

    public String get(String key) {
        return cache.get(key);
    }

    public void set(String key, String value) {
        cache.put(key, value);
    }
}
