package com.zhaodong8701.mockitoDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.BDDMockito.eq;
import static org.mockito.BDDMockito.given;

/**
 * Created by IntelliJ IDEA.
 * User: Dong Zhao
 * Date: 2014/5/8
 * Time: 14:28
 */
@RunWith(JUnit4.class)
public class AlgorithmTest {
    @Mock
    Cache cache;

    @InjectMocks
    @Spy
    AlgorithmCommon algorithmCommon;

    @InjectMocks
    @Spy
    SimpleAlgorithm simpleAlgorithm;

    @Test
    public void test1() {
        MockitoAnnotations.initMocks(this);
        MockitoAnnotations.initMocks(this);
        assertNotNull("algorithmCommon should not be null.", algorithmCommon);
        assertNotNull("simpleAlgorithm.algorithmCommon should not be null.", simpleAlgorithm.algorithmCommon);
        String key = "test_key";
        String value = "test_value";
        given(cache.get(eq(key))).willReturn(value);
        assertEquals("SimpleAlgorithm_" + value, simpleAlgorithm.f(key));
        assertEquals("AlgorithmImpl_AlgorithmCommon_" + value, simpleAlgorithm.g(key));
    }

    /**
     * This method will FAIL with message: simpleAlgorithm.algorithmCommon should not be null.
     */
    @Test
    public void test2() {
        MockitoAnnotations.initMocks(this);
        assertNotNull("algorithmCommon should not be null.", algorithmCommon);
        assertNotNull("simpleAlgorithm.algorithmCommon should not be null.", simpleAlgorithm.algorithmCommon);
        String key = "test_key";
        String value = "test_value";
        given(cache.get(eq(key))).willReturn(value);
        assertEquals("SimpleAlgorithm_" + value, simpleAlgorithm.f(key));
        assertEquals("AlgorithmImpl_AlgorithmCommon_" + value, simpleAlgorithm.g(key));
    }
}
