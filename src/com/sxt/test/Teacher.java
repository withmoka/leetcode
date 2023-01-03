package com.sxt.test;

public class Teacher {
    private String name;
    private int ID;

    public Teacher() {

    }

    public Teacher(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void helper() {
        ID = 100;
        System.out.println("Hello Everyone!" + " My ID is " + ID);
    }
}

class Student extends Teacher {
    private String name;
    private int ID;

    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public void helper() {
        super.helper();
        System.out.println("Hi Ms Brown!" + " My ID is " + ID);
        System.out.println(super.getID());
        System.out.println(ID);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Mike", 13);
        s1.helper();
    }
}