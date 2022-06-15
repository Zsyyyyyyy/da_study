package com.zsy.app;

import org.junit.Test;

public class Application {
    @Test
    public void containerWithMostWater() {
        int[] a = new int[]{1,8,6,2,5,4,8,3,7};
        int[] b = new int[]{2,3,4,5,18,17,6};
        ContainerWithMostWater.test(b);
    }


    @Test
    public void containerWithMostWater1() {
        int[] a = new int[]{1,8,6,2,5,4,8,3,7};
        int[] b = new int[]{2,3,4,5,18,17,6};
        ContainerWithMostWater.test(a);
    }

    @Test
    public void jumpGame() {
        int[] arr1 = new int[]{2,3,1,1,4};
        int[] arr2 = new int[]{3,2,1,0,4};
        int[] arr3 = new int[]{2,3,1,1,4};
        int[] arr4 = new int[]{0,1,4};
        System.out.println(JumpGame.test(arr3));
    }
}
