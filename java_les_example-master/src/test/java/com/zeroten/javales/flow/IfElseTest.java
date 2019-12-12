package com.zeroten.javales.flow;

// import org.testng.annotations.Test;

import org.junit.Test;

import java.util.Random;
import java.util.Scanner;

public class IfElseTest {

    @Test
    public void test1() {

        int a = 1;
        for (int i = 1; i < 100; i++) {
            a = a++;
        }
        System.out.println(a);
    }

    @Test
    public void testIfElse() {
//        下面我们来做一个示例：给定一个年龄，然后判断该年龄属于儿童、青年、中年还是老年；
//        年龄使用 int 类型，只支持整数。年龄段的划分规则如下：
//
//|年龄范围    |描述         |
//|-----------|------------|
//|0 ~ 6岁     |儿童 |
//|7 ~ 17岁    |少年 |
//|18 ~ 40岁   |青年 |
//|41 ~ 59岁   |中年 |
//|60及以上     |老年 |
        int age = 25;
        if (age < 7) {
            System.out.println(age + "岁，属于儿童");
        } else if (age < 18) {
            System.out.println(age + "岁，属于少年");
        } else if (age < 41) {
            System.out.println(age + "岁，属于青年");
        } else if (age < 60) {
            System.out.println(age + "岁，属于中年");
        } else {
            System.out.println(age + "岁，属于老年");
        }
    }

    @Test
    public void testWhile() {
//        练习：随机生成一个 `0 ～ 1000` 范围的整数，如果不能被30整除，则打印出数字，
//        如果能被30整除则退出循环。
//        生成 `0 ~ 1000` 范围的整数使用语句 `int r = new Random().nextInt(1000)`。

        boolean isContinue = true;
        int times = 0;
        while (isContinue) {
            int r = new Random().nextInt(1000);
            if (r % 30 == 0) {
                isContinue = false;
                System.out.println(r + "能被30整除，退出");
            } else {
                System.out.println(r + "不能被30整除，继续");
                times++;
//                times = times + 1;
//                times += 1;
//                ++times;
            }
        }
        System.out.println("随机产生了" + times + "个不能被30整除的数");

    }

    @Test
    public void testDoWhile() {
        int times = 0;
        boolean isContinue = true;
        do {
            int r = new Random().nextInt(1000);
            if (r % 30 == 0) {
                System.out.println(r + "能被30整除，退出");
                isContinue = false;
            } else {
                System.out.println(r + "不能被30整除，继续");
                times += 1;
            }
        } while (isContinue);

        System.out.println("随机产生了" + times + "个不能被30整除的数");
    }

    @Test
    public void testFor() {
//        练习：打印 `0 ~ 100` 范围内的单数并计算范围内单数的总个数。
        int total = 0;
        for (int n = 0; n <= 100; n++) {
            if (n % 2 != 0) {
                System.out.println(n + "是一个单数");
                ++total;
            }
        }
        System.out.println("0 ~ 100 范围内有" + total + "个单数");
    }

    @Test
    public void testSwitch() {
//        练习：假如你有一个机器人，你通过输入数字指令来指挥机器人，比如输入 `1` 让机器人扫地，
//        输入 `2` 让机器人打开灯。具体指令如下：
//
//|数字指令    |执行命令
//                |----------|--------|
//|1  |扫地
//                |2  |开灯
//                |3  |关灯
//                |4  |播放音乐
//                |5  |关闭音乐
//                |其他数字  |不能识别的指令
        int cmdN = 10;
        switch (cmdN) {
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
                System.out.println(cmdN + "：不能识别的指令");
        }
    }

    @Test
    public void testBreak() {
//        练习1：还是前边的练习，我们来改写一下。
// 随机生成一个 `0 ～ 1000` 范围的整数，如果不能被30整除，
// 则打印出数字，如果能被30整除则退出循环。
        int total = 0;
        while (true) {
            int r = new Random().nextInt(1000);
            if (r % 30 == 0) {
                System.out.println(r + "能被30整除，退出");
                break;
            } else {
                System.out.println(r + "不能能被30整除，继续");
                total++;
            }
        }
        System.out.println("随机产生了" + total + "个不能被30整除的数");

    }

//    练习2：编写一个方法 `int getMaxNumRem7(int n1, int n2)`
//    找出 `0 ~ n2` 范围内除以 n1 余 7 的最大的数，找到则返回该数，
//    如果找不到则返回 -1。

    int getMaxNumRem7(int n1, int n2) {
        for (int n = n2; n >= 0; n--) {
            if (n % n1 == 7) {
                return n;
            }
        }
        return -1;
    }

    @Test
    public void testReturn() {
        int r1 = getMaxNumRem7(10, 1000);
        System.out.println(r1);
    }

    @Test
    public void testContinue() {
//        练习3：找出 `0 ~ 100` 范围内能被7整除的数，
// 并计算它们累计相加的结果。
        int total = 0;
        for (int n = 0; n < 100; n++) {
            if (n % 7 != 0) {
                continue;
            }
            System.out.println(n + "能被7整除");
            total++;
        }
        System.out.println("0~100之间总共有" + total + "个数能被7整除");
    }
}
