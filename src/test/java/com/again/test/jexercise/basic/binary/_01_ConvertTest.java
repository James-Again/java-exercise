package com.again.test.jexercise.basic.binary;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dogrex on 2018/2/21.
 */
public class _01_ConvertTest extends _01_Convert {
    @Test
    public void testConvertInt() throws Exception {
        Assert.assertEquals("1010", convertInt(10, 2));
        Assert.assertEquals("12", convertInt(10, 8));
        Assert.assertEquals("A", convertInt(10, 16));
    }

}