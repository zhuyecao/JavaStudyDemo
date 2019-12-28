package com.zeroten.javales.classTest;


public class SamePackage {
    public static void main(String[] args){
        LessonExample exam = new LessonExample();
        System.out.println("年龄：" + exam.age);
        System.out.println("姓名：" + exam.name);
        System.out.println("性别：" + exam.sex);
//        因为weight是private成员变量，以下使用会编译报错
//        System.out.println("体重：" + exam.weight);
        System.out.println("-----------------");
        exam.testInnerAcl();    //因为testInnerAcl是public成员方法，故使用该方法是可以的；
    }
}
