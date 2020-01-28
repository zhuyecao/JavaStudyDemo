package com.zeroten.javales.innerClass;

import java.awt.datatransfer.DataFlavor;
import java.util.Arrays;

public class ArraysSequence {
    private Object[] data;
    private int next = 0;

    public ArraysSequence(int size){
        this.data = new Object[size];
    }

    public void add(Object ob){
        if(next < data.length){
            data[next] = ob;
            next++;
        }else{
            System.out.println("已超过限制的长度，添加不成功");
        }
    }

    public void print(){
        System.out.println(Arrays.toString(data));
    }

    public class SequenceSelector implements Selector{
        private int index = 0;
        @Override
        public boolean end(){
//            判断是否在序列末尾
            if(index >= data.length)
                return true;
            return false;
        }

        @Override
        public Object current(){
//            返回当前对象
            if(index < data.length)
                return data[index];
            return null;
        }

        @Override
        public void next(){
            if(index <= data.length-1)
                index++;
            else
                System.out.println("已到达序列末尾");
        }
    }
}
