package com.sxt.test;

import java.util.Objects;

public class Dog {
    private String name;
    private int age;

    public void shout() {
        System.out.println("汪");
    }

    public Dog(){

    }



    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //如果是同一个对象，返回true
        if (o == null || getClass() != o.getClass()) return false; //为空 或者类型不一样
        Dog dog = (Dog) o; //强转
        return name.equals(dog.name); //比较name是否相同
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static void main(String[] args) {
        TaiDi taiDi = new TaiDi();
        System.out.println(taiDi.toString());
    }
}

//class TaiDi {
//    public Dog dog = new Dog("miki",2);
//}

class TaiDi extends Dog {
    public TaiDi(){

    }

}

class BoMei extends Dog{
    public BoMei(){

    }
}

class Person extends Object{
    TaiDi tai = new TaiDi();

}
