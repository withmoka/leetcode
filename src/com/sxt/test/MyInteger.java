package com.sxt.test;

public class MyInteger {

    public static final int LOW = -128;
    public static final int HIGH = 127;

    private int value;
    private static MyInteger[] cache = new MyInteger[HIGH - LOW + 1];


    static {
        for (int i = LOW; i <= HIGH; i++) {
            cache[i + 128] = MyInteger.valueOf(i);
        }
    }

    public static MyInteger valueOf(int i) {
        if (i >= LOW && i <= HIGH) {
            return cache[i + 128];
        }
        return new MyInteger(i);
    }

    private MyInteger(int i) {
        this.value = i;
    }

    public static void main(String[] args) {
        MyInteger m = new MyInteger(3000);
        System.out.println(m.value);
    }
}
