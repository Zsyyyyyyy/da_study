package com.zsy.app;

public class ContainerWithMostWater {
    public static int test1() {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        int i = 0;
        int j = height.length - 1;
        int area = 0;
        int r = height.length;

        while(r>0) {
            area = Math.max(Math.min(height[i],height[j]) * (j - i),area);
            if(height[i] >= height[j]) {
                j--;
            } else {
                i++;
            }
            r--;
        }
        System.out.println(area);
        return area;
    }
    public static int test2() {
        int i,j;
        int[] height = new int[]{2,3,4,5,18,17,6};
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
    public static void main(String[] args) {
        test2();
    }

}
