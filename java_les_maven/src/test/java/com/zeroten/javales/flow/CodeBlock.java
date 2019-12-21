package com.zeroten.javales.flow;

import org.testng.annotations.Test;

//块（也可以叫复合语句）指的是由⼀对花括号括起来的若⼲语句的组合。块决定了变量的作⽤域。⼀个块可以嵌套在另⼀个块中。
//变量作⽤域，就是你定义的变量，可以在哪些地⽅被访问。
// 块内定义的变量，只能被花括号括起来的代码访问（读/写）到，包括嵌套在它之内的其他⼦块。⽽在花括号范围之外，变量就不能被访问。

public class CodeBlock {
    @Test
    public void testBlockScope(){
        int n1 = 100;
        System.out.println(n1);

        int n2 = 222;
        {
            System.out.println(n2);
//            int n2 = 22;    //此行语句是错误的，因为在上层代码块中已经定义了n2这个变量，所以再定义n2会报错，只能赋值
            n2 = 22;
            System.out.println(n2);
            int n3 = 333;
            System.out.println(n3);
        }
        System.out.println(n2); //子块对变量的操作是生效的，所以n2=22
//        System.out.println(n3); //因为n3是在嵌套的子块里定义的，在这里访问已经是在它所在的花括号之外了，因此访问出错
    }

}
