package com.sxt.test.inner;

public class TestAnonymousInnerClass {

    public void test(A a) {
        a.run();
    }

    public static void main(String[] args) {
        TestAnonymousInnerClass ta = new TestAnonymousInnerClass();
        ta.test(new A() {
            @Override
            public void run() {
                System.out.println("run!!!!!");
            }
        });
    }
}

//class AA implements A {
//
//    @Override
//    public void run() {
//        System.out.println("run!!!!!!");
//    }
//}

interface A {
    void run();
}