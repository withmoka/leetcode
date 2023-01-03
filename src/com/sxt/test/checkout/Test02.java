package com.sxt.test.checkout;


// step over 方法作为一个整体执行
// step into 会进入自定义的方法执行
// step out 进入方法内部时，把剩下的执行完，返回上一层方法
// 左边三角条：跳到下一个断点
public class Test02 {
    private int num = 10;

    public void run(int a) {
        num = num * a;
        go(num);
    }

    public void go(int b){
        System.out.println("Test02.go");
        System.out.println("b="+b);
    }

    public static void main(String[] args) {
        Test02 t = new Test02();
        t.run(3);
        System.out.println("step");
    }
}
