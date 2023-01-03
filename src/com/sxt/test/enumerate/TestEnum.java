package com.sxt.test.enumerate;

import java.util.Random;

public class TestEnum {

    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.WINTER);
        for (Week w : Week.values()) {
            System.out.println(w);
        }
        int a = new Random().nextInt(4);
        switch (Season.values()[a]) {
            case AUTUMN -> System.out.println("I like autumn!");
            case SPRING -> System.out.println("spring");
            case WINTER -> System.out.println("winter???");
            case SUMMER -> System.out.println("hot!");
        }
    }
}

enum Season {
    // 不需要赋值
    SPRING, SUMMER, AUTUMN, WINTER
}

enum Week {
    星期一, 星期二, 星期三, 星期四, 星期五, 星期六, 星期天
}
