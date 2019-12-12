package com.zeroten.javales.flow;

//import org.testng.Assert;
import org.testng.annotations.Test;

import org.junit.Assert;
//import org.junit.Test;

public class AgeCheckTest {
    //        下面我们来做一个示例：给定一个年龄，然后判断该年龄属于儿童、青年、中年还是老年；
//        年龄使用 int 类型，只支持整数。年龄段的划分规则如下：
//
//|年龄范围    |描述         |
//|-----------|------------|
//|0 ~ 6岁     |儿童 |
//|7 ~ 17岁    |少年 |
//|18 ~ 40岁   |青年 |
//|41 ~ 59岁   |中年 |
//|60及以上     |老年 |


    // String AgeCheck.getAgeName(int age)


    @Test
    public void testAgetCheck1() {
        Assert.assertEquals(AgeCheck.getAgeName(6), "儿童");
        Assert.assertEquals(AgeCheck.getAgeName(7), "少年");
        Assert.assertEquals(AgeCheck.getAgeName(20), "青年");
    }

    @Test
    public void testAgetCheck2() {
        Assert.assertEquals(AgeCheck.getAgeName(45), "中年");
        Assert.assertEquals(AgeCheck.getAgeName(60), "老年");
        Assert.assertEquals(AgeCheck.getAgeName(80), "老年");
    }


}
