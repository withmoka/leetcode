package com.sxt.test;

public class Man {
}

interface Bird {
    //    public static final String name = "bird";
    String name = "bird";

    //    public abstract void cry();
    void cry();
}

interface Box {
    int size = 100; // public static int size = 100;

    void open();

    default int getMoney(int money) {
        System.out.println("get money " + money);
        return money;
    }

    static void shout() {
        System.out.println("wow!");
    }
}

class BigBox implements Box {

    @Override
    public void open() {
        System.out.println("open the big box!");
    }

    @Override
    public int getMoney(int money) {
        System.out.println("change " + money);
        return money;
    }

    public static void main(String[] args) {
        Box.shout();
    }
}

interface Honest {
    void tellTruth();
}

class Angel implements Bird, Honest {

    @Override
    public void cry() {
        System.out.println("wow!");
    }

    @Override
    public void tellTruth() {
        System.out.println("yes!");
    }
}