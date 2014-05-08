package com.zhaodong8701.mockitoDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: Dong Zhao
 * Date: 2014/5/8
 * Time: 14:31
 */
@Component
public class AlgorithmCommon {
    @Autowired
    Cache cache;

    public String g(String key) {
        return "AlgorithmCommon_" + cache.get(key);
    }
}
