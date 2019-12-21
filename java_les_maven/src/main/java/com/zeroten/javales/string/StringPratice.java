package com.zeroten.javales.string;

import org.testng.annotations.Test;

public class StringPratice {
//    去掉字符串开头/结尾/中间的空格（不使⽤ trim ⽅法）
    public static String removeAllSpaces(String str){
        if(str==null)
            return str;
        int len = str.length();
        StringBuilder temp = new StringBuilder(len);
        int count = 0;
        for(int i = 0; i < len; i++){
            char c = str.charAt(i);
            if(c != ' '){
                temp.append(c);
                count++;
            }
        }
        temp.setLength(count);
        return temp.toString();
    }

//    反转字符串，⽐如输⼊ 123，反转结果 321
    public static String reverseString(String str){
        if(str == null)
            return str;
        StringBuilder temp = new StringBuilder(str.length());
        for(int i = str.length()-1; i >= 0; i--){
            temp.append(str.charAt(i));
        }
        return temp.toString();
    }


}
