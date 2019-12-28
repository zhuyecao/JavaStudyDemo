package com.zeroten.javales.classTest;

public class CodeBlockTest {
    static String className = "创建对象测试";
    static String staticFieldNotSet;
    final static String finalStaticField;
    int index = -1;
    {
        System.out.println("执⾏第⼀个初始化块：" + index);
        index = 1;
        System.out.println(" 赋值后：" + index);
    }
    static {
        System.out.println("执⾏第⼀个静态初始化块");
        finalStaticField = "final 修饰的静态域必须进⾏显式的赋值初始化";
    }
    {
        System.out.println("执⾏第⼆个初始化块：" + index);
        index = 2;
        System.out.println(" 赋值后：" + index);
    }
    static {
        System.out.println("执⾏第⼆个静态初始化块");
    }
    public CodeBlockTest() {
        System.out.println("执⾏构造器");
        this.index = 3;
        className = "创建对象测试 - 构造器赋值";
    }
    public static void print(){
        System.out.println("执行第一个静态方法");
    }

    public static void main(String[] args) {
        new CodeBlockTest();
//        CodeBlockTest.print();
    }
    {
        System.out.println("执⾏第三个初始化块");
    }
    static {
        System.out.println("执⾏第三个静态初始化块");
    }
    {
        System.out.println("执⾏第四个初始化块");
    }
    static {
        System.out.println("执⾏第四个静态初始化块");
    }
}
