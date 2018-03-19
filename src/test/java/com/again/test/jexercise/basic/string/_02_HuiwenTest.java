package com.again.test.jexercise.basic.string;

import org.junit.Assert;
import org.junit.Test;

public class _02_HuiwenTest extends _02_Huiwen {
    @Test
    public void testIsHuiwen() {
        Assert.assertTrue(isHuiwen("x"));
        Assert.assertTrue(isHuiwen("xx"));
        Assert.assertTrue(isHuiwen("xax"));
        Assert.assertTrue(isHuiwen("xaax"));
        Assert.assertFalse(isHuiwen("xxa"));
    }
}
