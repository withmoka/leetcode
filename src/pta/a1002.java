package pta;

import java.util.Scanner;

public class a1002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = 1001;
        Double[] a = new Double[N];
        for (int i = 0; i < N; i++) {
            a[i] = 0.0;
        }
        Double[] b = new Double[N];
        for (int i = 0; i < N; i++) {
            b[i] = 0.0;
        }
        int k = in.nextInt();
        while (k != 0) {
            int index = in.nextInt();
            double value = in.nextDouble();
            a[index] = value;
            k--;
        }
        k = in.nextInt();
        while (k != 0) {
            int index = in.nextInt();
            double value = in.nextDouble();
            b[index] = value;
            k--;
        }
        Double[] c = new Double[N];
        int count = 0;
        for (int i = 0; i < N; i++) {
            c[i] = a[i] + b[i];
            if (c[i] != 0) {
                count++;
            }
        }
        System.out.print(count);
        for (int i = N - 1; i >= 0; i--) {
            if (c[i] != 0) {
                System.out.print(" " + i + " ");
                System.out.printf("%.1f", c[i]);
            }
        }
    }
}
