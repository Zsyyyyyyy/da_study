package com.zsy.app;


import java.lang.reflect.Array;
import java.util.ArrayList;

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
    public static void main(String[] args) {

        test1();
    }

}
