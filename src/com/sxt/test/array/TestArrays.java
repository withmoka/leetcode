package com.sxt.test.array;

import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {
        int[] arr = {1, 20, 100, 99, 90};
        String res = Arrays.toString(arr);
        System.out.println(res);
        Arrays.sort(arr); // 直接改变原来的数组
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr, 1, 3, -1); // 索引包头不包尾
        System.out.println(Arrays.toString(arr));
        /*
         [1, 20, 100, 99, 90]
         [1, 20, 90, 99, 100]
         [1, -1, -1, 99, 100]
         */
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // 二分查找必须要先排序
        int index = Arrays.binarySearch(arr, 99);
        System.out.println(index); // 对[-1, -1, 1, 99, 100]查找到99索引为3
    }
}
