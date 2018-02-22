package com.again.test.jexercise.basic.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _01_SortTest extends _01_Sort {

    @Test
    public void testSort() {
        int[] array = new int[]{1, 3, 2};
        sort(array);

        Assert.assertArrayEquals(new int[]{1, 2, 3}, array);
    }
}