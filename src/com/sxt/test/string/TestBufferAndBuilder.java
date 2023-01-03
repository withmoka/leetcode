package com.sxt.test.string;

public class TestBufferAndBuilder {
    public static void main(String[] args) {
        String str8 = "";
        long num1 = Runtime.getRuntime().freeMemory();  // 获取系统剩余的内存空间
        System.out.println(num1);
        long time1 = System.currentTimeMillis();
        System.out.println(time1);
        for (int i = 0; i < 5000; i++) {
            str8 = str8 + i;
        }
        long num2 = Runtime.getRuntime().freeMemory();
        long time2 = System.currentTimeMillis();
        System.out.println("String占用内存：" + (num1 - num2));
        System.out.println("String占用时间：" + (time2 - time1));
        System.out.println("*****");
        StringBuilder sb = new StringBuilder();
        long num3 = Runtime.getRuntime().freeMemory();
        long time3 = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            sb.append(i);
        }
        long num4 = Runtime.getRuntime().freeMemory();
        long time4 = System.currentTimeMillis();
        System.out.println("String占用内存：" + (num3 - num4));
        System.out.println("String占用时间：" + (time4 - time3));
    }
}
