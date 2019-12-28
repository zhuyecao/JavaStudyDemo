package com.zeroten.javales.array;

import java.util.Arrays;

public class towSum {
//    给定⼀个整数数组 nums 和⼀个⽬标值 target，请你在该数组中找出和为⽬标值的那 两个 整数，并返回他们的
//    数组下标。
//    你可以假设每种输⼊只会对应⼀个答案。但是，你不能重复利⽤这个数组中同样的元素。
//    示例:
//    给定 nums = [2, 7, 11, 15], target = 9
//    因为 nums[0] + nums[1] = 2 + 7 = 9
//    所以返回 [0, 1]

    public static int[] two_sum_base(int[] nums, int target){
        int[] result = new int[2];
        for(int index = 0; index < nums.length; index++){
            for(int sec_index = index+1; sec_index < nums.length; sec_index++){
                if((nums[index] + nums[sec_index]) == target){
                    result[0] = index;
                    result[1] = sec_index;
                    return result;
                }
            }
        }
        return null;
    }

}
