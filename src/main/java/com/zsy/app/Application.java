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
}
