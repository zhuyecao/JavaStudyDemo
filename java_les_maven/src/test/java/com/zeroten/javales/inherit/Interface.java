package com.zeroten.javales.inherit;

public interface Interface {
    class InnerClass{};
    interface InnerInterface{};
//    接⼝中的域则被⾃动设置为 public static final，故变量必须赋值，且不可更改(final的特性）
    int MAX_COUNT = 145;
//    接⼝中的⽅法都⾃动被设置为 public,接⼝中定义的⽅法不能有⽅法体。
    void method();      //相当于public void method();
//    void method11(){}     //Java8以下版本该语句编译出错，接⼝中定义的⽅法不能有⽅法体。

//    Java8以前接⼝不能包含实例域和静态⽅法
//    Java 8 版本开始对接⼝做了以下增强
//    在⽅法声明前添加 default 关键字时，则可以为该⽅法编写⼀个默认实现，这个特征叫默认⽅法或
//    者扩展⽅法；但是默认⽅法不能覆盖 Object 中的⽅法，却可以重载 Object 中的⽅法。
//    接⼝⾥可以声明静态⽅法，静态⽅法必须有⽅法体。
    default void method2(){
        System.out.println("这个是接口中的默认方法，Java8版本开始有的特性");
    }

//    接口中的静态方法只能通过接口去调用，实现了接口的类及其对象都不能继承接口中的静态方法
    static void method3(){
        System.out.println("这个是接口中的静态方法，是Java8开始有的特性，静态方法必须有方法体");
    }
}
