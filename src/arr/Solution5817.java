package arr;

public class Solution5817 {
    public int getLucky(String s, int k) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch : arr) {
            int a = ch - 'a' + 1;
            sb.append(String.valueOf(a));
        }
        String str = sb.toString();
        while (k > 0) {
            str = getSum(str);
            k--;
        }
        return Integer.parseInt(str);
    }

    //一个字符串，求和，返回字符串
    public String getSum(String str) {
        char[] temp = str.toCharArray();
        int sum = 0;
        for (char ch : temp) {
            int number = (int) ch - (int) ('0');
            sum += number;
        }
        return String.valueOf(sum);
    }
}
