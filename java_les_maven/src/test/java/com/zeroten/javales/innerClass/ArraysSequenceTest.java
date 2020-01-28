package com.zeroten.javales.innerClass;

import org.testng.annotations.Test;

public class ArraysSequenceTest {

    @Test
    public void test01(){
        ArraysSequence as = new ArraysSequence(5);
        as.add(23);
        as.add(12);
        as.add(47);
        as.add(2);
        as.print();

        as.add(19);
        as.add(24);
        as.print();

//        使用内部类遍历序列
        ArraysSequence.SequenceSelector ss = as.new SequenceSelector();
        while(!ss.end()){
            System.out.println(">>" + ss.current().toString());
            ss.next();
        }
    }
}
