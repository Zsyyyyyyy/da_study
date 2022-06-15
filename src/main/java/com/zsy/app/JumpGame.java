package com.zsy.app;

//给定一个非负整数数组nums ，你最初位于数组的 第一个下标 。
//数组中的每个元素代表你在该位置可以跳跃的最大长度。
//判断你是否能够到达最后一个下标。


public class JumpGame {

//        int[] nums2 = new int[]{2,3,1,1,4};

    public static boolean test(int[] nums) {
        int re = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if(i <= re) {
                re = Math.max(re,(nums[i] + i));
            } else {
                return false;
            }
        }
        if(re >= nums.length -1) {
            return true;
        } else{
            return false;
        }
    }
}
