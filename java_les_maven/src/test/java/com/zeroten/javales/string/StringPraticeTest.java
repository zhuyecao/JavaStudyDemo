package com.zeroten.javales.string;

import com.zeroten.javales.flow.AgeCheck;
import org.testng.annotations.Test;
import org.testng.Assert;

public class StringPraticeTest {
//    测试字符串去掉空格的函数removeAllSpaces运行是否正常
    @Test
    public void testRemoveAllSpaces(){
        Assert.assertEquals(StringPratice.removeAllSpaces("    "), "");
        Assert.assertEquals(StringPratice.removeAllSpaces("  hello+world  "), "hello+world");
        Assert.assertEquals(StringPratice.removeAllSpaces(" H e l l0"), "Hell0");
        Assert.assertEquals(StringPratice.removeAllSpaces("hello    "), "hello");
        Assert.assertEquals(StringPratice.removeAllSpaces("hello"), "hello");
        Assert.assertEquals(StringPratice.removeAllSpaces(null), null);
    }

//    测试字符串翻转reverseString函数是否正常
    @Test
    public void testReverseString(){
        Assert.assertEquals(StringPratice.reverseString("1234abc"), "cba4321");
        Assert.assertEquals(StringPratice.reverseString("我是猫"), "猫是我");
        Assert.assertEquals(StringPratice.reverseString(" 123 4a bc"), "cb a4 321 ");
    }

    @Test
    public void testEquals(){
        String s1 = "hello" + ", world!";
        String s2 = "hello";
        s2 += ", world!";
        String s3 = "hello, world!";
        String s4 = s2.intern();
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s2 == s3);
        System.out.println(s2 == s4);
    }
}
