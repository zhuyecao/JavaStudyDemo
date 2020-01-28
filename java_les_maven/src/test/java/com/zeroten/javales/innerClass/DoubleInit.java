package com.zeroten.javales.innerClass;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class DoubleInit {
    @Test
    public void normalInitialization(){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println(nums);
    }

    @Test
    public void doubleBraceInitialization(){
        ArrayList<Integer> nums = new ArrayList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
        }};
        System.out.println(nums);
    }

//    以下是doubleBraceInitialization中的原理
    @Test
    public void doubleBraceReason(){
        class ArrayListNew extends ArrayList{
//            以下是在类中定义的初始化代码块，实例代码块是在创建对象的时候被调用的，
//            以下代码是使用实例代码块来对对象进行初始化
            {
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
            }
        }
        ArrayList nums = new ArrayListNew();
        System.out.println(nums);
    }

}
