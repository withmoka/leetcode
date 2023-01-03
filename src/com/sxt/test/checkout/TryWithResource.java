package com.sxt.test.checkout;

import java.io.FileReader;

//jdk7 以后
public class TryWithResource {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("/Users/momochan/IdeaProjects/practice/src/com/sxt/test/checkout/a.txt");) {
            char c = (char)reader.read();
            char c2 = (char)reader.read();
            System.out.println(""+c+c2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
