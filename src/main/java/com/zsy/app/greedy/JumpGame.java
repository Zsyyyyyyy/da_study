package com.zsy.app.greedy;

//给定一个非负整数数组nums ，你最初位于数组的 第一个下标 。
//数组中的每个元素代表你在该位置可以跳跃的最大长度。
//判断你是否能够到达最后一个下标。


public class JumpGame {

//        int[] nums2 = new int[]{2,3,1,1,4};

    public static boolean test(int[] nums) {
        //初始化能到达的最远下标为0
        int re = 0;
        //对数组nums进行遍历，从第一位至倒数第二位
        for (int i = 0; i < nums.length - 1; i++) {
            // 判断 i 是否小于等于最远可达下标
            // 如果为真：对当前下标可达下标和re取最大值，更新re
            // 如果为假：返回false
            if(i <= re) {
                re = Math.max(re,(nums[i] + i));
            } else {
                return false;
            }
        }
        // 遍历结束，判断最远可达距离是否可达最后一位
        if(re >= nums.length - 1) {
            return true;
        } else{
            return false;
        }
    }
}
