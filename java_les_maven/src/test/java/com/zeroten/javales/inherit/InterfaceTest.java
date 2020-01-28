package com.zeroten.javales.inherit;

import org.testng.annotations.Test;

public class InterfaceTest {
    @Test
    public void testInterfaceMethod(){
        InterfaceImp i = new InterfaceImp();
        i.method();
        i.method2();
        Interface.method3();
//        接⼝不是类，不能使⽤ new 操作符进⾏实例化。以下语句编译会报错
//        Interface i2 = new Interface();
//        接⼝变量必须引⽤实现了接⼝的类对象。
//        如下，声明时用接口Interface，但是实际是指向了实现了Interface的接口的类对象InterfaceImp进行创建的
        Interface i2 = new InterfaceImp();
        i2.method();
    }

    @Test
    public void testStaticMethod(){
//    接口中的静态方法只能通过接口去调用，实现了接口的类及其对象都不能继承接口中的静态方法
        Interface.method3();
//        以下编译出错
//        InterfaceImp.method3();
//        Interface i = new InterfaceImp();
//        i.method3();

    }

    @Test
    public void testInstanceOf(){
        Interface i = new InterfaceImp();
//        可以使⽤ instanceof 来检查⼀个对象是否实现了某个特定的接⼝。
        System.out.println(i instanceof Interface);
        System.out.println(i instanceof InterfaceImp);
        System.out.println(i instanceof Interface1);
    }
}
