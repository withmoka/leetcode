package com.sxt.test.array;

public class Man {
    private String name;
    private int age;

    public Man() {
    }

    public Man(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name:" + name + " age:" + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Man[] arr_man = {new Man("a", 18), new Man("b", 19), new Man("c", 20)};
        int[] arr_num = {1, 3, 4};
        int[] arr_test = null;
        int[] arr_test2;
        arr_test2 = new int[6];
        System.out.println(arr_test2);
        for (Man man : arr_man) {
            System.out.println(man.getName() + " " + man.getAge());
            System.out.println(man);
        }
        for (int ele : arr_test2) {
            System.out.println(ele);
        }
    }
}
