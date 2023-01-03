package com.sxt.test;

import java.util.Locale;

public class TestString {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "ab";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println(s1.lastIndexOf("bcd"));

        String str1 = "abcdcd".replace('d', 'D');
        String str2 = "abcdcd".replace("cd", "CCCDDD");
        System.out.println(str1);
        System.out.println(str2);

        Boolean flag = "abcdefg".endsWith("f");
        System.out.println(flag);

        String s = "abcdefg";
        String s0 = s.substring(3,5);
        System.out.println(s0);

        String ww = "sjdjdkD";
        String w1 = ww.toLowerCase(Locale.ROOT);
        System.out.println(w1);
        String w2 = ww.toUpperCase(Locale.ROOT);
        System.out.println(w2);

        String qq = "           dijmsmmkkk   ";
        String q = qq.trim();
        System.out.println(q);

        String ee = "   djd  dksj  sjakka       dhdjsm sdks ";
        String e = ee.replace(" ","");
        System.out.println(e); // djddksjsjakkadhdjsmsdks
    }
}
