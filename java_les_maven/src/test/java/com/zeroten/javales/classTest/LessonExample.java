package com.zeroten.javales.classTest;

import org.testng.annotations.Test;

public class LessonExample {

//    修饰符         说明 当前类 同包 ⼦类(不同包) 不同包   备注
//    public        公开    √     √   √            √     可⽤于类、接⼝、成员变量、⽅法
//    protected     保护    √     √   √            ×     可⽤于成员变量、⽅法
//    default       默认    √     √   ×            ×     可⽤于类、接⼝、成员变量、⽅法
//    private       私有    √     ×   ×            ×     可⽤于成员变量、⽅法
//    以下用成员变量进行验证，成员方法也是一样的
    public int age = 24;
    protected String name = "wenxiaoba";
    String sex = "女";
    private int weight = 114;

    @Test
    public void testInnerAcl(){
        System.out.println("年龄：" + age);
        System.out.println("姓名：" + name);
        System.out.println("性别：" + sex);
        System.out.println("体重：" + weight);
    }
    public void print(int...numbs){
        if (numbs.length <= 0)
            System.out.println("无参数传入");
        else{
            System.out.println("传入的参数个数为：" + numbs.length);
            for (int num : numbs){
                System.out.print(num + "    ");
            }
        }
    }

    @Test
    public void testVariableParams(){
        print();
        System.out.println("-----------------------");
        print(34);
        System.out.println("-----------------------");
        print(1, 3, 5, 3);
    }



}
