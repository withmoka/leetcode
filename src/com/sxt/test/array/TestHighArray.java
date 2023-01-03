package com.sxt.test.array;

import java.util.Arrays;

public class TestHighArray {
    public static void main(String[] args) {
        int[][] a = new int[3][];
        a[0] = new int[3];
        a[0][1] = 2;
        System.out.println(Arrays.toString(a[0])); // 0 2 0
        int[][] b = {{1, 2, 3}, {2}, {4, 5, 6, 7}};
        System.out.println(b[2][3]); // 7
        int[][] c = new int[4][];
        c[0] = new int[]{2, 3, 4};
        int[] d = {1, 2, 3};
    }
}
