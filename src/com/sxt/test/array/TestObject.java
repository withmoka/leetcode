package com.sxt.test.array;

import java.util.Arrays;

public class TestObject {
    public static void main(String[] args) {
        Object[] a1 = {1001, "高一", 18, "讲师", "2019-2-14"};
        Object[] a2 = {1002, "高二", 19, "助教", "2019-10-10"};
        Object[] a3 = {1003, "高三", 20, "班主任", "2019-5-5"};
        Object[][] emps = new Object[3][];
        emps[0] = a1;
        emps[1] = a2;
        emps[2] = a3;
        // 怎么打印二维数组的内容
        for (Object[] emp : emps) {
            System.out.println(Arrays.toString(emp));
        }
        // 或者
        for (int i = 0; i < emps.length; i++) {
            if ((int) (emps[i][2]) > 18) {
                for (int j = 0; j < emps[i].length; j++) {
                    System.out.print(emps[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
