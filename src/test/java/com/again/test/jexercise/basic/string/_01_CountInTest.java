package com.again.test.jexercise.basic.string;

import org.junit.Assert;
import org.junit.Test;

public class _01_CountInTest extends _01_CountIn {
    @Test
    public void test() {
        Assert.assertEquals(3, countIn("xxx123", 'x'));
        Assert.assertEquals(0, countIn("xxx123", 'a'));
        Assert.assertEquals(4, countIn("xxx123x", 'x'));
    }
}
