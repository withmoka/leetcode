package com.sxt.test;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int a = 10 + random.nextInt(10);
        System.out.println(a);
        double b = random.nextDouble();
        System.out.println(b);
    }
}
