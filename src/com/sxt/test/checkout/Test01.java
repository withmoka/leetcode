package com.sxt.test.checkout;

import java.io.File;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("step1");
        try {
            int i = 1/0;
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("step2");
        File f = new File("happen.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
