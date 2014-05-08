package com.zhaodong8701.mockitoDemo;

import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: Dong Zhao
 * Date: 2014/5/8
 * Time: 14:28
 */
@Component
public class SimpleAlgorithm extends AlgorithmImpl {
    @Override
    public String f(String key) {
        return "SimpleAlgorithm_" + cache.get(key);
    }
}
