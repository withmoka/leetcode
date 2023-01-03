package com.sxt.test.array;

public class TestArr {
    public static void main(String[] args) {
        String[] arr = {"阿里", "bilibili", "京东", "字节", "网易"};
        String[] arr2 = new String[3];
        System.arraycopy(arr, 2, arr2, 1, 2);
        for (String ele : arr2) {
            System.out.println(ele);
        }
        /*
        null
        京东
        字节
         */
    }
}
