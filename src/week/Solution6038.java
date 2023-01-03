package week;

import java.util.HashMap;
import java.util.Map;

public class Solution6038 {
    public static String minimizeResult(String expression) {
        int res = Integer.MAX_VALUE;
        String p1 = "";
        String p2 = "";
        int flag = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '+') {
                flag = i;
            }
        }
        String a = expression.substring(0, flag);
        String b = expression.substring(flag + 1);
        Map<String, String> mul2plus = new HashMap<>();
        mul2plus.put(a, "1");
        for (int i = 1; i < a.length(); i++) {
            mul2plus.put(a.substring(i), a.substring(0, i));
        }
        Map<String, String> plus2mul = new HashMap<>();
        plus2mul.put(b, "1");
        for (int i = 1; i < b.length(); i++) {
            plus2mul.put(b.substring(0, i), b.substring(i));
        }
        for (String plus1 : mul2plus.keySet()) {
            for (String plus2 : plus2mul.keySet()) {
                String mul1 = mul2plus.get(plus1);
                String mul2 = plus2mul.get(plus2);
                int sum = Integer.parseInt(plus1) + Integer.parseInt(plus2);
                int tmp = Integer.parseInt(mul1) * Integer.parseInt(mul2) * sum;
                if (tmp < res) {
                    p1 = plus1;
                    p2 = plus2;
                    res = tmp;
                }
            }
        }
        String m1 = mul2plus.get(p1);
        String m2 = plus2mul.get(p2);
        StringBuffer sb = new StringBuffer();
        if (!p1.equals(a)) {
            sb.append(m1);
        }
        sb.append("(");
        sb.append(p1);
        sb.append("+");
        sb.append(p2);
        sb.append(")");
        if (!p2.equals(b)) {
            sb.append(m2);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String exp = "999+999";
        String res = minimizeResult(exp);
        System.out.println(res);
    }
}
