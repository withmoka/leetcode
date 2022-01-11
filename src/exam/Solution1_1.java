package exam;

class Solution1_1 {
    public static void helper(int num) {
        int[] arr = new int[10];
        int n = String.valueOf(num).length();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n * (int) Math.pow(10, n - 1);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        helper(11);
    }
}
