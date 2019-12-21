package com.zeroten.javales.flow;

import org.testng.annotations.Test;

import java.util.Random;

public class BlockTest {
    @Test
    public void testIfElse(){
//        条件语句：当某个条件成⽴时，执⾏⼀条或多条语句；如果条件不成⽴则执⾏另⼀条语句或另⼏条语句
//        给定一个年龄，然后判断该年龄属于儿童、青年、中年还是老年；
//        年龄使用 int 类型，只支持整数。年龄段的划分规则如下：
//        |年龄范围    |描述         |
//        |-----------|------------|
//        |0 ~ 6岁     |儿童 |
//        |7 ~ 17岁    |少年 |
//        |18 ~ 40岁   |青年 |
//        |41 ~ 59岁   |中年 |
//        |60及以上     |老年 |
        int age = 60;
        if(age <= 6){
            System.out.println(age + "岁，属于儿童");
        }else if (age <= 17){
            System.out.println(age + "岁，属于少年");
        }else if (age <= 40){
            System.out.println(age + "岁，属于青年");
        }else if (age <= 59){
            System.out.println(age + "岁，属于中年");
        }else {
            System.out.println(age + "岁，属于老年");
        }
    }

//     while (Boolean-Exception)
//          statement
//    当 Boolean-Exception 的结果为真（true）时，⼀直执⾏ statement ，直到 Boolean-Exception的结果为假（false）。
    @Test
    public void testWhile(){
//        随机⽣成⼀个 0 ～ 1000 范围的整数，如果不能被30整除，则打印出数字，如果能被30整除
//        则退出循环。⽣成 0 ~ 1000 范围的整数使⽤语句 int r = new Random().nextInt(1000) 。
        boolean isContinue = true;
        int currentTimes = 0;
        while(isContinue){
            int r = new Random().nextInt(1000);
            if(r % 30 != 0){
                System.out.println(r + "不能被30整除");
                currentTimes++;
            }else{
                isContinue = false;
                System.out.println(r + "能被30整除");
                currentTimes++;
            }
        }
        System.out.println("循环执行次数：" + currentTimes);
    }

//      do
//          statement
//      while (Boolean-Exception)
//  do-while 和 while 的区别是 do-while 语句⾄少会执⾏⼀次，当表达式 Boolean-Exception 为假（false）时，退出循环
    @Test
    public void testDoWhile(){
        boolean isContinue = true;
        int notFitNums = 0;
        do{
            int r = new Random().nextInt(1000);
            if (r % 30 != 0){
                System.out.println(r + "不能被30整除，继续循环");
                notFitNums++;
            }else {
                System.out.println(r + "能被30整除，退出循环");
                isContinue = false;
            }
        }while (isContinue);
        System.out.println("随机产生了" + notFitNums + "个不能被30整除的整数");
    }

//    for 循环应该是⼀种总常⽤的循环，它的语法结构如下：
//            for (initialization; Boolean-Exception; step)
//    statement
//    执⾏过程
//            1. 执⾏初始化表达式 initialization 。
//            2. 执⾏布尔表达式 Boolean-Exception ，如果结果为 false，退出循环；如果为 true，执⾏语法
//    块 statement 。
//            3. Boolean-Exception = true 时，执⾏语法块 statement 。
//            4. 执⾏步进 step 运算。 5。 跳转第 ii 步继续执⾏。
//    注意： 初始化 initialization 、布尔表达式 Boolean-Exception 和步进 step 都可以为空。
    @Test
    public void testFor(){
        //    打印 0 ~ 100 范围内的单数并计算范围内单数的总个数。
        int sum = 0;
        for(int i = 0; i < 100; i++){
            if(i % 2 ==1){
                System.out.println(i);
                sum++;
            }
        }
        System.out.println("0-100范围内单数个数：" + sum);
    }


//    多重选择 switch
//    当有多个选项时，如果使⽤ if-else 语法程序就会显得冗⻓笨拙，这时我们可以使⽤ switch 语句：
//    switch (integral-selector) {
//        case integral-value1: statement; break;
//        case integral-value2: statement; break;
//        case integral-value3: statement; break;
//        ......
//        default: statement;
//    }
//    Integral-selector （整数选择因⼦）是⼀个能产⽣整数值的表达式。当产⽣的结果，和 case 后的值相等
//    时，执⾏ case 后边的语句，直到 break 结束。
    @Test
    public void testSwitch(){
//        假如你有⼀个机器⼈，你通过输⼊数字指令来指挥机器⼈
//        数字指令 执⾏命令
//        1 扫地
//        2 开灯
//        3 关灯
//        4 播放⾳乐
//        5 关闭⾳乐
//        其他数字 不能识别的指令
        int command = 6;
        switch(command){
            case 1:
                System.out.println("1：扫地");
                break;
            case 2:
                System.out.println("2：开灯");
                break;
            case 3:
                System.out.println("3：关灯");
                break;
            case 4:
                System.out.println("4：播放音乐");
                break;
            case 5:
                System.out.println("5：关闭音乐");
                break;
            default:
                System.out.println("不能识别的指令");
        }
    }

//    当⼀个循环执⾏中，如果想要退出循环或者不再执⾏后边的语句直接进⾏下⼀次循环。我们就需要⽤到中断
//    流程控制语句，包括： return 、 break 、 continue 。
//            return 中断当前循环并直接返回
//    break 跳出循环，继续执⾏该循环体后边的语句
//    continue 不再执⾏本次循环后边还未执⾏的语句，跳转循环开始的地⽅进⾏下⼀次循环的执⾏
    @Test
    public void testBreak(){
//        随机⽣成⼀个 0 ～ 1000 范围的整数，如果不能被30整除，则打印出数字，如果能被30整除则退出循环。
        while(true){
            int num = new Random().nextInt(1000);
            if (num % 30 == 0){
                System.out.println(num + "能被30整除，退出循环");
                break;
            }else{
                System.out.println(num + "不能被30整除，继续循环");
            }
        }
        System.out.println("退出了循环");
    }

//    练习1：编写⼀个⽅法 int getMaxNumRem7(int n1, int n2) 找出 0 ~ n2 范围内除以 n1 余 7 的最⼤的
//    数，找到则返回该数，如果找不到则返回 -1。
    public int getMaxNumRem7(int n1, int n2){
        for(int n = n2; n >= 0; n--){
            if(n % n1 == 7){
                return n;
            }
        }
        return -1;
    }
    @Test
    public void testMaxNumRem7(){
        System.out.println(getMaxNumRem7(8, 40));
    }

//    找出 0 ~ 100 范围内能被7整除的数，并计算它们累计相加的结果。
    @Test
    public void testSumNumMul7(){
        int sum = 0;
        for(int i = 0; i <= 100; i++){
            if(i % 7 == 0){
                sum += i;
                System.out.println(i + "能被7整除");
            }
        }
        System.out.println("0~100内能被7整除的整数之和：" + sum);
    }
}
