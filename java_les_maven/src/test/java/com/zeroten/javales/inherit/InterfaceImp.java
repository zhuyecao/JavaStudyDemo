package com.zeroten.javales.inherit;

public class InterfaceImp implements Interface{
//    类通过 implements 关键字来实现⼀个或多个接⼝。即一个类可以实现多个接口，如下
//    public class InterfaceImp implements Interface, Interface1{...}
//    可以使用instanceof判断是否实现了某个接口
    @Override
    public void method(){
        System.out.println("我是一个方法，在InterfaceImp中被实现的");
    }
}
