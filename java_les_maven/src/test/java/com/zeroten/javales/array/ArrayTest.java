package com.zeroten.javales.array;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ArrayTest {

    @Test
    public void testArrayInit(){
//        数组的3中初始化方式：
//        第1种：
        int[] array1;
        array1 = new int[3];
        System.out.println(Arrays.toString(array1));
        array1[0] = 0;
        array1[1] = 1;
        array1[2] = 2;
        System.out.println(Arrays.toString(array1));
//        第2种：
        String[] array2 = {"wen", "xiao", "ba"};
        System.out.println(Arrays.toString(array2));

//        第3种：
        char[] array3 = new char[]{'a', 'b', 'c'};
        System.out.println(Arrays.toString(array3));

//        数组必须分配了内存空间后才能使用，如下就会报错，array4还未分配内存空间
//        int[] array4;
//        System.out.println(Arrays.toString(array4));
    }

    @Test
    public void testArrayTraversal(){
//        三种⽅式遍历数组 Integer[] arr = {1, 2, 3, 4, 5};
        Integer[] arr = {1, 2, 3, 4, 5};

//        第1种：for 循环使⽤数组下标
        for(int index = 0; index < arr.length; index++){
            System.out.println(String.format("下标%d存放的值是：%d", index, arr[index]));
        }

//        第2种：for each 循环
        int index = 0;
        for(int num: arr){
            System.out.println(String.format("数组下标%d存放的值是：%d", index, arr[index]));
            index++;
        }

//        第3种：Java 8 中新增的 Lambda 表达式
        Arrays.asList(arr).forEach(val -> {
            if(val % 2 == 0)
                System.out.println(String.format("值为%d，是偶数", val));
            else
                System.out.println(String.format("值为%d，是奇数", val));
        });
    }

    @Test
    public void testArrayTraversal2(){
//        三种⽅式遍历数组 Integer[] arr = {1, 2, 3, 4, 5};
        int[] arr = {1, 2, 3, 4, 5};

//        第1种：for 循环使⽤数组下标
        for(int index = 0; index < arr.length; index++){
            System.out.println(String.format("下标%d存放的值是：%d", index, arr[index]));
        }

//        第2种：for each 循环
        int index = 0;
        for(int num: arr){
            System.out.println(String.format("数组下标%d存放的值是：%d", index, arr[index]));
            index++;
        }

//        第3种：Java 8 中新增的 Lambda 表达式，基本数据类型不能使用
//        因为Arrays.asList(T... a)参数类型是 T ，根据官方文档的描述，T 是数组元素的 class，基本数据类型无class属性
//        故基本数据类型不能使用Lambda表达式来遍历数组
//        Arrays.asList(arr).forEach(val -> {
//            if(val % 2 == 0)
//                System.out.println(String.format("值为%d，是偶数", val));
//            else
//                System.out.println(String.format("值为%d，是奇数", val));
//        });
    }

    @Test
    public void testCopy(){
        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {6, 7, 8, 9, 10};
//      拷⻉数组 arr1 的前 3 个元素
        Integer[] arr3 = Arrays.copyOf(arr1, 3);    //arr3 = [1, 2, 3]
        System.out.println(Arrays.toString(arr3));

//      拷⻉数组 arr1 的第 1 位到第 3 位的元素（不包括第 3 位）
        Integer[] arr4 = Arrays.copyOfRange(arr1, 1, 3);
//      arr4 = [2, 3]，即arr1的下标1到2的值
        System.out.println(Arrays.toString(arr4));
//      拷⻉数组 arr2 的后 3 位，放到 arr1 下标1之后的位置进行填充
        System.arraycopy(arr2, 2, arr1, 1, 3);  //arr1 = [1, 8, 9, 10, 5]
        System.out.println(Arrays.toString(arr1));
    }
}
