package com.again.test.jexercise.basic.binary;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dogrex on 2018/2/21.
 */
public class _01_ConvertTest extends _01_Convert {
    @Test
    public void testConvertInt_2() throws Exception {
        Assert.assertEquals("1010", convertInt(10, 2));
    }

    @Test
    public void testConvertInt_8() throws Exception {
        Assert.assertEquals("12", convertInt(10, 8));
    }

    @Test
    public void testConvertInt_16() throws Exception {
        Assert.assertEquals("A", convertInt(10, 16));
    }



}