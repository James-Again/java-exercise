package com.again.test.jexercise.basic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dogrex on 2018/2/20.
 */
public class PrimeTest extends Prime {
    @Test
    public void testIsPrime() {
        Assert.assertTrue(isPrime(2));
        Assert.assertFalse(isPrime(4));
        Assert.assertTrue(isPrime(79));
    }

    @Test
    public void testPrimeCount() {
        Assert.assertEquals(1, primeCount(2));
        Assert.assertEquals(2, primeCount(3));
        Assert.assertEquals(8, primeCount(20));
    }

}