package com.zeroten.javales.classTest1;

import com.zeroten.javales.classTest.LessonExample;

public class ChildClass extends LessonExample {
    public void print(){
        System.out.println("年龄：" + age);
        System.out.println("姓名：" + name);
//        sex为default修饰的成员变量，不同包下子类不能访问，以下会编译出错
//        System.out.println("性别：" + sex);
//        因为weight是private成员变量，以下使用会编译报错
//        System.out.println("体重：" + weight);
    }
    public static void main(String[] args){
        ChildClass exam = new ChildClass();
        exam.print();
        System.out.println("-----------------");
        exam.testInnerAcl();    //因为testInnerAcl是public成员方法，故使用该方法是可以的；
    }
}