package com.sxt.test;

import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        long a = Long.MAX_VALUE/(365*24*60*60*1000L);
        System.out.println(a);
        long nowNum = System.currentTimeMillis();
        System.out.println(nowNum);
        System.out.println("****");
        Date d1 = new Date(1000*60*60*24*365L);
        System.out.println(d1);
        System.out.println(d1.getTime());
        long time = d1.getTime();
        System.out.println(time);
    }
}
