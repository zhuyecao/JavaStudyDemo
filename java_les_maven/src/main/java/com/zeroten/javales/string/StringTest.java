package com.zeroten.javales.string;

import org.testng.annotations.Test;

public class StringTest {
    @Test
    public void stringRAMTest(){
//      JVM 有⼀个字符串常量池，每次使⽤双引号定义字符串，JVM 会先到该常量池中来检测
//      是否已经存在，存在则直接该对象的引⽤；否则在常量池中创建⼀个新增并返回该值的引⽤。
//      使⽤ new 创建字符串（new String("字符串");）时，会直接在堆中创建该字符串并返回其引⽤。从 Java 6
//      开始，String 类提供了 intern() ⽅法，调⽤该⽅法时，JVM 去字符串常量池检测是否已存在该字符串，如果
//      已经存在则直接返回引⽤；如果不存在则在常量池中添加并返回其引⽤。具体判断逻辑如下：
//      1.使用双引号括起来的字符串赋值时，JVM先去字符串常量池中查找该字符串，存在则返回对应的引用地址，
//        不存在则在字符串常量池中创建字符串并返回对应的引用地址
//      2.使用new方式穿件的字符串，JVM会在堆中分配新的内存存放数据并返回引用
//      3.不管是用什么方法赋值，String对象使用了intern方法是，JVM都是走的第1点的逻辑，去字符串常量池中查找
//      4.使用 + 或 += 时，若两边都是用双引号的赋值的字符串，则走的是字符串常量池的逻辑，若有变量或使用了new，则走堆的逻辑

        String str1 = "hello";
        String str2 = "hello";
        String str3 = "hello" + "world";
        String str4 = str2 + "world";
        String str5 = new String("hello");
        String str6 = new String("hello");
        String str7 = str6.intern();
        String str8 = new String("hello").intern();
        System.out.println("str1 = str2, " + (str1 == str2));
        System.out.println("str3 = str4, " + (str3 == str4));
        System.out.println("str1 = str5, " + (str1 == str5));
        System.out.println("str5 = str6, " + (str5 == str6));
        System.out.println("str1 = str7, " + (str1 == str7));
        System.out.println("str1 = str8, " + (str1 == str8));
        String str9 = "hello";
        str9 += "world";
        System.out.println("str3 = str9, " + (str3 == str9));

    }

    @Test
    public void testStringLength(){

//        int length() 返回采⽤ UTF-16 编码表示的给定字符串所需要的代码单元数量。也即是 String
//        类内部 char 数组的⻓度。（char 数据类型是⼀个采⽤ UTF-16 编码表示 Unicode 代码点的代码单
//        元）
//        int codePointCount(int beginIndex, int endIndex) 表示字符串的实际⻓度，及代
//        码点数。
//        可以理解为：length()是计算有多少个Unicode字符，因为中文和英文都可以用1个Unicode表示，而codePointCount是计算有多少点
        String str1 = "hello,world";
        System.out.println(str1);
        System.out.println(str1.length());
        System.out.println(str1.codePointCount(0, str1.length()));

        String str2 = "wo是谁";
        System.out.println(str2);
        System.out.println(str2.length());
        System.out.println(str2.codePointCount(0, str2.length()));

        String str3 = "hello,\uD835\uDD5D\uD835\uDD60\uD835\uDD60\uD835\uDD5C";
        System.out.println(str3);
        System.out.println(str3.length());
        System.out.println(str3.codePointCount(0, str3.length()));
//        执行结果：
//        hello,world
//        11
//        11
//        wo是谁
//        4
//        4
//        hello,𝕝𝕠𝕠𝕜
//        14
//        10
    }

    @Test
    public void testSubString(){
        String str = "are you fine?";

//        String substring(int beginIndex)，返回从下标是beginIndex开始到字符串末尾的子字符串
        String str1 = str.substring(4);
        System.out.println(str1);
//        String substring(int beginIndex, int endIndex)，返回从下标是beginIndex到下标是endIndex的子字符串
        String str2 = str.substring(8, str.length() - 1);
        System.out.println(str2);
//        结果：
//        you fine?
//        fine
    }

    @Test
    public void testStringSplice(){
        String str = "hello" + " world!";
        System.out.println(str);
        String str1 = "hello";
        str1 += " world!";
        System.out.println(str1);
        String str2 = "hello";
        str2 = str2 + " world!";
        System.out.println(str2);
//        都是：hello world!
    }

    @Test
    public void testStringFormat(){
//    %s 字符串
//    %c 字符类型
//    %b 布尔类型
//    %d 整数类型（⼗进制数）
//    %x 整数类型（⼗六进制数）
//    %o 整数类型（⼋进制数）
//    %f 浮点类型
//    %a 浮点类型（⼗六进制数）
//    %% 百分⽐类型
//    %n 换⾏

        String str1 = String.format("%c %s cake.", 'I', "eat");
        System.out.println(str1);
        System.out.println(String.format("布尔true：%b, %n整数：%d, %n浮点数：%f, %n浮点数小数点5位：%.5f", true, 23, 3.45f, 1.23f));
        System.out.println(String.format("整数，16进制：%x，8进制：%o，浮点数16进制：%a，百分比：85%%", 100, 17, 23.456, 0.45));
    }

    @Test
    public void testStringEquals(){
        String str1 = new String("Hello, world");
        String str2 = new String("hello, world");
        String str3 = new String("hello, world");
        String str4 = null;
//        equals 判断变量所引用的地址中，值是否相等，使用是注意，str.equals(str2)中，str不能是null
        System.out.println(str2 == str3);
        System.out.println(str2.equals(str3));
        System.out.println(str2.equals(str4));
        System.out.println(str4.equals(str2));  //因为str3是null,故程序运行到这里会报错
//        忽略大小写比较是否相等
        System.out.println(str1.equalsIgnoreCase(str2));
    }

    @Test
    public void testStartAndEnd(){
        String str = "good afternoon";
//        str.startsWith(String str2)：判断str是否以str2开头
        System.out.println(str.startsWith("goo"));
        System.out.println(str.startsWith("oo"));
//        str.endsWith(String str2)：判断str是否以str2结尾
        System.out.println(str.endsWith("noon"));
        System.out.println(str.endsWith("noo"));
    }

    @Test
    public void testContains(){
        String str = "Cat eat mouse";
//        str.contains(String str2)：判断str字符串是否包含str2字符串，包含则返回true,否则返回false
        boolean result = str.contains("eat ");
        System.out.println(result);
        System.out.println(str.contains("eate"));
    }

    @Test
    public void testFind(){
        String str = "hello, world, have a good day";
//        str.indexOf(String str2, int index):从字符串str的下标为index的位置开始找字符串str2
//        若找到返回最开始匹配的下标的值，否则返回-1,
//        index参数可以不传，默认是0
        int index = str.indexOf("wo", 3);
        System.out.println(index);
        System.out.println(str.indexOf("hah"));
//        str.lastIndexOf(String str2, int index):从字符串str的indext位置，向开头方向找字符串str2
//        若找到返回最开始匹配的下标的值，否则返回-1,
//        index可以不用传，不传时3默认是从字符串最末尾开始查找

        index = str.lastIndexOf("o");
        System.out.println(index);
        System.out.println(str.lastIndexOf("hah"));
        System.out.println(str.lastIndexOf("a", 25));

    }

    @Test
    public void testReplace(){
        String str = "hello, world";
//        str.replace(char oldChar, char newChar)：将字符串str中的oldChar字符替换成newChar,并返回替换后的字符串
        String str2 = str.replace('l', 'L');
        System.out.println(str);
        System.out.println(str2);
//        str.replaceAll(String regex, String replacement)：
//        将字符串str中符合正则表达式regex的子字符串替换成replacement，并返回替换后的字符串
        System.out.println(str.replaceAll("o", "OO"));
        System.out.println("hello1nice4to25meet6you,".replaceAll("[0-9]", " * "));
//        运行结果：
//        hello, world
//        heLLo, worLd
//        hellOO, wOOrld
//        hello * nice * to *  * meet * you,
    }

    @Test
    public void testCaseConversion(){
        System.out.println("Hello, World".toUpperCase());
        System.out.println("Hello,WOrld".toLowerCase());
    }

    @Test
    public void testRemoveSpaces(){
//        str.trim()：去掉字符串str首尾两端的空格
        String str = " Hel lo, world         ";
        String str2 = str.trim();
        System.out.println(str2);
        System.out.println(str2.length());
        System.out.println("[" + str2 + "]");
    }

//    StringBuffer和StringBuilder的使用
//    1.都继承⾃ AbstractStringBuilder 类
//    2.在创建时，如果未指定容量，默认容量为 16
//    区别：StringBuffer 类的所有⽅法都使⽤关键字 synchronized 来保证线程安全
//    两者常用方法:
//      append 在字符串结尾追加
//      length 返回当前⻓度
//      setLength 设置字符串⻓度
    @Test
    public void testStringBuffer(){
        StringBuffer str = new StringBuffer();
        str.append("hello");
        str.append(" world");
        str.append("!");
        System.out.println(str.toString());
        System.out.println(str.length());
        str.setLength(15);
        System.out.print(str);
        System.out.println("done");
        str.setLength(7);
        System.out.println(str);
    }

    @Test
    public void testStringBuilder(){
        StringBuilder str = new StringBuilder();
        str.append("hello");
        str.append(" world");
        str.append("!");
        System.out.println(str.toString());
        System.out.println(str.length());
        str.setLength(15);
        System.out.print(str);
        System.out.println("done");
        str.setLength(7);
        System.out.println(str);
    }

    @Test
    public void testStringCostTime(){
        long start = System.currentTimeMillis();
        String str = "";
        for(int i = 0; i <= 50000; i++){
            str += i;
        }
        System.out.println(str.length());
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start) + "ms");
    }

    @Test
    public void testStringBulider(){
        long start = System.currentTimeMillis();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i <= 50000; i++){
            str.append(i);
        }
        System.out.println(str.length());
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start) + "ms");
    }

    @Test
    public void testStringBufferr(){
        long start = System.currentTimeMillis();
        StringBuffer str = new StringBuffer();
        for(int i = 0; i <= 50000; i++){
            str.append(i);
        }
        System.out.println(str.length());
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start) + "ms");
    }

}
