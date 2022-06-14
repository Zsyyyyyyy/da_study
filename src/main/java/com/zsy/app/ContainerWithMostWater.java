package com.zsy.app;

//给定一个长度为 n 的整数数组height。有n条垂线，第 i 条线的两个端点是(i, 0)和(i, height[i])。
//找出其中的两条线，使得它们与x轴共同构成的容器可以容纳最多的水。
//返回容器可以储存的最大水量。
//
//说明：你不能倾斜容器。
public class ContainerWithMostWater {
    public static int test(int[] height) {
        int i,j;
        int r = height.length;
        i = 0;
        j = height.length - 1;
        int area = Math.min(height[i],height[j]) *  (j-i);
        while((r-1) > 0) {
            if (height[j] >= height[i]) {
                i++;
            } else {
                j--;
            }
            area = Math.max(Math.min(height[i],height[j]) * Math.abs(j-i),area);
            r--;
        }
        System.out.println(area);
        return area;
    }

}
