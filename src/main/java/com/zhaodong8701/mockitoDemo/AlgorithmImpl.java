package com.zhaodong8701.mockitoDemo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by IntelliJ IDEA.
 * User: Dong Zhao
 * Date: 2014/5/8
 * Time: 14:31
 */
public abstract class AlgorithmImpl implements IAlgorithm {
    @Autowired
    AlgorithmCommon algorithmCommon;

    @Autowired
    Cache cache;

    @Override
    public String g(String key) {
        return "AlgorithmImpl_" + algorithmCommon.g(key);
    }
}
