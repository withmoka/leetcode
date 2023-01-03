package sxt;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void helper() {
        System.out.println("hello");
    }

    // main方法可以写在任何一个类里面 main看起来形式上属于这个类，实际上不属于，实际上是独立的
    public static void main(String[] args) {
        Student s1 = new Student(10,"小李"); // 这里调的是构造方法，不传入参数就是默认赋值，int 0、boolean false、String null...
        Student s2 = new Student(11,"小王");
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s2.id);
        System.out.println(s2.name);
    }
}
