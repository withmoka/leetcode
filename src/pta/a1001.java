package pta;

import java.text.DecimalFormat;
import java.util.Scanner;

public class a1001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a + b;
        StringBuilder sb = new StringBuilder();
        if (sum < 0) {
            sb.append("-");
        }
        sum = Math.abs(sum);
        String str = String.valueOf(sum);
        if (str.length() < 4) {
            sb.append(str);
        } else {
            int index = 0;
            int left = str.length() % 3;
            if (left != 0) {
                for (index = 0; index < left; index++) {
                    sb.append(str.charAt(index));
                }
                sb.append(",");
            }
            while (index != str.length()) {
                sb.append(str.charAt(index));
                index++;
                if ((index - left) % 3 == 0 && index != str.length()) {
                    sb.append(",");
                }
            }
        }
        System.out.println(sb.toString());
    }
}
