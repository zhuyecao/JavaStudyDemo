package com.zeroten.javales.flow;

import org.testng.annotations.Test;
import org.testng.Assert;
//测试驱动开发（Test-Driven Development），简称 TDD。简单来说就是先写测试，再写实现。
// 此开发模式有个优点：以后如果开发的代码有改动，可以运行测试代码，确定本次修改会不会将之前的代码逻辑处理错误。
// 目前该项目是将测试代码放在test中，开发代码放在main中，便于管理
public class AgeCheckTest{
//给定一个年龄，然后判断该年龄属于儿童、青年、中年还是老年；
//年龄使用 int 类型，只支持整数。年龄段的划分规则如下：
//
//|年龄范围    |描述         |
//|-----------|------------|
//|0 ~ 6岁     |儿童 |
//|7 ~ 17岁    |少年 |
//|18 ~ 40岁   |青年 |
//|41 ~ 59岁   |中年 |
//|60及以上     |老年 |

    @Test
    public void testChildAge(){
        // 测试儿童年龄是否正确
        Assert.assertEquals(AgeCheck.getAgeName(1),"儿童");
        Assert.assertEquals(AgeCheck.getAgeName(3),"儿童");
        Assert.assertEquals(AgeCheck.getAgeName(6),"儿童");
    }

    @Test
    public void testJuvenile(){
        // 测试少年年龄是否正确
        Assert.assertEquals(AgeCheck.getAgeName(7),"少年");
        Assert.assertEquals(AgeCheck.getAgeName(15),"少年");
        Assert.assertEquals(AgeCheck.getAgeName(17),"少年");
    }

    @Test
    public void testYouth(){
        // 测试青年年龄是否正确
        Assert.assertEquals(AgeCheck.getAgeName(18),"青年");
        Assert.assertEquals(AgeCheck.getAgeName(32),"青年");
        Assert.assertEquals(AgeCheck.getAgeName(40),"青年");
    }

    @Test
    public void testMiddle(){
        // 测试中年年龄是否正确
        Assert.assertEquals(AgeCheck.getAgeName(41),"中年");
        Assert.assertEquals(AgeCheck.getAgeName(47),"中年");
        Assert.assertEquals(AgeCheck.getAgeName(59),"中年");
    }

    @Test
    public void testOld(){
        // 测试老年年龄是否正确
        Assert.assertEquals(AgeCheck.getAgeName(60),"老年");
        Assert.assertEquals(AgeCheck.getAgeName(83),"老年");
    }
}
