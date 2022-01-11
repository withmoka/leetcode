package test;

public class cloneTest {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(a[i]);
        }
        int[] a_cp = a.clone();
        for (int i = 0; i < a_cp.length; i++) {
            System.out.println(a_cp[i]);
        }
    }
}
