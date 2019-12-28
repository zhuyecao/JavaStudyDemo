package com.zeroten.javales.array;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Random;

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

//        public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
//        src:源数组;
//        srcPos:源数组要复制的起始位置;
//        dest:目的数组;
//        destPos:目的数组放置的起始位置;
//        length:复制的长度.
    }

    @Test
    public void testFill(){
//        ⽤⼯具类提供的⽅法 Arrays.fill 可以对数组全部或指定范围内的元素赋值为指定的值。
//        Arrayss.fill(T[] arr, int fromIndex, int toIndex, T value):
//        将数组arr的下标从fromIndex（包含）到toIndex（不包含）位置的元素全部赋值为value;
//        定义⼀个⼤⼩为 10 的 int 数组，并将数组全部初始化为指定的值 5，打印数组；然后将数组后 4 位赋值
//        为 3，再次打印数组
        int[] arr = new int[10];
        Arrays.fill(arr, 5);
        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr, arr.length - 4, arr.length, 3);
        System.out.println(Arrays.toString(arr));
//        jaing1
        int[] arr1 = new int[6];
        Arrays.fill(arr1, 2, 4, 15);
        System.out.println(Arrays.toString(arr1));
    }

    @Test
    public void testSort(){
//        可以使⽤ Arrays.sort ⽅法对数组进⾏升序排序
//        定义⼀个⼤⼩为 100 的 int 数组，
//        随机给每⼀位赋值⼀个 0 ~ 100 之间的数值，
//        然后对该数组进⾏排序
//        并打印排序结果。
        int[] arr = new int[100];
        for(int index = 0; index < arr.length; index++){
            arr[index] = new Random().nextInt(100);
        }
        System.out.println("排序前：" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后：" + Arrays.toString(arr));
    }

    @Test
    public void testMultidimension(){
//        Java 实际上没有多维数组，只有⼀维数组。多维数组可以被理解为“数组的数组”。
//        多维数组的同⼀个维可以有不同的⻓度，因此也可以称为不规则数组。声明时使⽤多个 [] 标识来声明。

//        示例：定义⼀个⼆维数组，第⼀维表示⽤户，第⼆维表示⽤户的具体信息（1. 编码, 2. 姓名, 3.性别, 4.年龄）。
//        定义赋值并打印。
        String[][] users = new String[3][];
        users[0] = new String[4];
        users[0][0] = "001";
        users[0][1] = "张三";
        users[0][2] = "女";
        users[0][3] = "23";

        users[1] = new String[4];
        users[1][0] = "002";
        users[1][1] = "李四";
        users[1][2] = "男";
        users[1][3] = "33";

        users[2] = new String[3];
        users[2][0] = "003";
        users[2][1] = "王五";
        users[2][2] = "女";
//        users[2][3] = "27";

        System.out.println(Arrays.toString(users));

        System.out.println("--------------------分割线---------------------------");

        for(String[] user : users){
            System.out.println(Arrays.toString(user));
        }
    }

    @Test
    public void testNoInit(){
        int[] n = new int[3];
        String[] s = new String[3];
        System.out.println(n[1]);
        System.out.println(s[1]);
    }

    @Test
    public void testBinarySearch(){
        int[] arr = new int[40];
        int value = 0;
        for(int index = 0; index < arr.length; index++){
            arr[index] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        while(true){
            value = new Random().nextInt(100);
            int index = Arrays.binarySearch(arr, value);
            if( index >= 0){
                System.out.println(value + "在数组中存在，位置为：" + (index+1));
                break;
            }else{
                System.out.println(value + "未存在");
            }
        }

    }
}
