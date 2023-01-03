package com.sxt.test.string;

import java.util.Locale;

public class TestBuffer {
    public static void main(String[] args) {
        String s = "   aB BcaB  ";
        String up = s.toUpperCase(Locale.ROOT);
        System.out.println(up);
        String low = s.toLowerCase(Locale.ROOT);
        System.out.println(low);
        System.out.println(s.equalsIgnoreCase(up));
//        System.out.println(s.trim());  // trim 修剪
//        boolean flag = s.startsWith("   a");
//        int num = s.lastIndexOf("aB");
//        System.out.println(flag);
//        System.out.println(num);
        String next = s.substring(1,4);
        System.out.println(next);
        String re = s.replace("aB","Ab");
        System.out.println(re);
        System.out.println(re.concat(" here!"));
    }
}
