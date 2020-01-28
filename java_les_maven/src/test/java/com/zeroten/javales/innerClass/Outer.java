package com.zeroten.javales.innerClass;

public class Outer {
    interface Inter {
        void show();
    }

    // TODO: 补全代码
    public static Inter create(){
        return new Inter(){
            @Override
            public void show(){
                System.out.println("helloworld");
            }
        };
    }

    public static void main(String[] args) {
        Outer.create().show();
    }
}
