package com.zeroten.javales.innerClass;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Random;

public class CalcMinMaxTest {
    @Test
    public void test1(){
        Random temp = new Random();
        int num = temp.nextInt(15);
        int[] numbs = new int[num];
        for(int i = 0; i < num; i++){
            numbs[i] = temp.nextInt(100);
        }
        System.out.println("数组："+Arrays.toString(numbs));

        int[] result = new CalcMinMax().calc(numbs);
        System.out.println("最小值："+result[0]);
        System.out.println("最大值："+result[1]);

        Pair resultPair = new CalcMinMax().calc1(numbs);
        System.out.println("最小值："+resultPair.getMin());
        System.out.println("最大值："+resultPair.getMax());
    }

    @Test
    public void test2(){
        Random temp = new Random();
        int num = temp.nextInt(15);
        int[] numbs = new int[num];
        for(int i = 0; i < num; i++){
            numbs[i] = temp.nextInt(100);
        }
        System.out.println("数组："+Arrays.toString(numbs));

        CalcMinMax.PairCopy result = new CalcMinMax().calc2(numbs);
        System.out.println("最小值：" + result.getMin());
        System.out.println("最大值：" + result.getMax());
    }
}
