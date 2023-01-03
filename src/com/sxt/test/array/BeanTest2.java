package com.sxt.test.array;

public class BeanTest2 {
    public static void main(String[] args) {
        Commodity commodity0 = new Commodity(1, "鼠标", "BZ_001", 99.21, 0.9);
        Commodity commodity1 = new Commodity(2, "玩偶", "WO_102", 403, 0.7);
        Commodity commodity2 = new Commodity(3, "书", "BK_001", 89, 0.8);
        Commodity commodity3 = new Commodity(4, "西装", "GQ_XF_12", 700, 0.5);
        Commodity commodity4 = new Commodity(5, "手机", "DM_PH_13", 900, 0.3);

        Commodity[] arr = {commodity0, commodity1, commodity2, commodity3, commodity4};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAll(100) != null) {
                System.out.println(arr[i].getAll(100));
            }
        }

    }
}

class Commodity {
    private int id;
    private String name;
    private String type;
    private double price;
    private double account;

    @Override
    public String toString() {
        return "Commodity{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", type='" + getType() + '\'' +
                ", price=" + getPrice() +
                ", account=" + getAccount() +
                '}';
    }

    public String getAll(double price) {
        if (price > getPrice() * account) {
            return "Commodity{" +
                    "id=" + getId() +
                    ", name='" + getName() + '\'' +
                    ", type='" + getType() + '\'' +
                    ", price=" + getPrice() +
                    ", account=" + getAccount() +
                    '}';
        }
        return null;
    }

    public Commodity() {
    }

    public Commodity(int id, String name, String type, double price, double account) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.account = account;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }
}