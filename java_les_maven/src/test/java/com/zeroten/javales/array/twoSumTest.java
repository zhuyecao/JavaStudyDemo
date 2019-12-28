package com.zeroten.javales.array;

import org.testng.annotations.Test;
import org.testng.Assert;

public class twoSumTest {

    @Test
    public void testTowSumBase(){
        Assert.assertEquals(towSum.two_sum_base(new int[]{2, 4, 7}, 6), new int[]{0,1});
        Assert.assertEquals(towSum.two_sum_base(new int[]{2, 4, 7, 3, 12}, 7), new int[]{1, 3});
        Assert.assertEquals(towSum.two_sum_base(new int[]{2, 4, 7}, 8), null);
        Assert.assertEquals(towSum.two_sum_base(new int[]{2, 4, 7}, 4), null);
    }
}
