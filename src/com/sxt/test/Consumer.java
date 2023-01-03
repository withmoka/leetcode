package com.sxt.test;

import java.util.concurrent.locks.Condition;

abstract public class Consumer {

    private String name;

    abstract public void shout();

    public static void main(String[] args) {
        StuConsumer stuConsumer = new StuConsumer();
        stuConsumer.shout();
    }

    public Consumer(String name) {
        this.name = name;
    }

    Consumer() {}
}

class StuConsumer extends Consumer {

    @Override
    public void shout() {
        System.out.println("hello");
    }
}

