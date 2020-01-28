package com.zeroten.javales.innerClass;

public class CalcMinMax {

    public int[] calc(int ... numbs){
        if(numbs.length == 0)
            return new int[]{0, 0};
        int min = numbs[0];
        int max = numbs[0];
        for (int numb : numbs){
            if(min > numb)
                min = numb;
            if(numb > max)
                max = numb;
        }
        return new int[]{min, max};
    }

//    可以将返回值进行包装，便于使用和管理，以下是对cals的返回值进行包装的写法
    public Pair calc1(int ... numbs){
        if(numbs.length == 0)
            return new Pair(0, 0);
        int min = numbs[0];
        int max = numbs[0];
        for (int numb : numbs){
            if(min > numb)
                min = numb;
            if(numb > max)
                max = numb;
        }
        return new Pair(min, max);
    }

//    将Pair类设置成内部类，这样就是该类专门使用的，不会因为其他的类也要使用而进行维护
    public static class PairCopy {
        private int min;
        private int max;

        public PairCopy(int min, int max){
            this.min = min;
            this.max = max;
        }
        public int getMin(){
            return min;
        }
        public int getMax(){
            return max;
        }
    }

    public PairCopy calc2(int ...numbs){
        if(numbs.length == 0)
            return new PairCopy(0, 0);
        int min = numbs[0];
        int max = numbs[0];
        for (int numb : numbs){
            if(min > numb)
                min = numb;
            if(numb > max)
                max = numb;
        }
        return new PairCopy(min, max);
    }
}
