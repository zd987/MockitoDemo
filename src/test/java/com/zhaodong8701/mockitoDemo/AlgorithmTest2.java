package com.zhaodong8701.mockitoDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by IntelliJ IDEA.
 * User: Dong Zhao
 * Date: 2014/5/8
 * Time: 14:28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class AlgorithmTest2 {
    @Autowired
    Cache cache;

    @Autowired
    AlgorithmCommon algorithmCommon;

    @Autowired
    SimpleAlgorithm simpleAlgorithm;

    @Test
    public void test1() {
        assertNotNull("algorithmCommon should not be null.", algorithmCommon);
        assertNotNull("simpleAlgorithm.algorithmCommon should not be null.", simpleAlgorithm.algorithmCommon);
        String key = "test_key";
        String value = "test_value";
        cache.set(key, value);
        assertEquals("SimpleAlgorithm_" + value, simpleAlgorithm.f(key));
        assertEquals("AlgorithmImpl_AlgorithmCommon_" + value, simpleAlgorithm.g(key));
    }
}
