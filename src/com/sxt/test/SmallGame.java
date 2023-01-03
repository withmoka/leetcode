package com.sxt.test;

public class SmallGame implements Game {
    @Override
    public int charge(int money) {
        return money;
    }

    @Override
    public int charge() {
        return 0;
    }

    public static void main(String[] args) {
        SmallGame sg = new SmallGame();
        int money = sg.charge(200);
        System.out.println(money);
    }
}
