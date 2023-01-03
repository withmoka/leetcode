package com.sxt.test.array;

/*
 * 使用javabean和（对应的！）数组存储表格信息
 */

public class BeanTest {
    public static void main(String[] args) {
        Employee employee0 = new Employee(1001, "Amy", 18, "engineer", "2019-4-4");
        Employee employee1 = new Employee(1002, "Mike", 19, "engineer", "2019-10-10");
        Employee employee2 = new Employee(1003, "John", 20, "engineer", "2018-10-20");

        Employee[] emps = {employee0, employee1, employee2};

        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i]);
        }

    }
}

class Employee {
    private int id;
    private String name;
    private int age;
    private String job;
    private String hiredate;

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", age=" + getAge() +
                ", job='" + job + '\'' +
                ", hiredate='" + hiredate + '\'' +
                '}';
    }

    public Employee(int id, String name, int age, String job, String hiredate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.job = job;
        this.hiredate = hiredate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age + "岁";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }
}
