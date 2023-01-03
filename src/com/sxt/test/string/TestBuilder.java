package com.sxt.test.string;

public class TestBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s1 = "abc";
        String s2 = "def";
        char ch = 'g';
        sb.append(s1);
        sb.append(s2);
        sb.append(ch);
        System.out.println(sb.toString());
        sb.delete(3, 6);
        System.out.println(sb.toString());
        sb.deleteCharAt(3);
        System.out.println(sb.toString());
        sb.insert(0, 0.23);
        System.out.println(sb.toString());
        sb.append(230);
        System.out.println(sb.toString());
        System.out.println(sb.reverse().toString());
        System.out.println(sb.length());
        System.out.println(sb.charAt(2));
        System.out.println(sb.indexOf("cb"));
    }
}
