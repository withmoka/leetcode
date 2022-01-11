package arr;

public class Solution5824 {
    public String maximumNumber(String num, int[] change) {
        char[] arr = num.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        int index = 0;
        while (index < arr.length) {
            char ch = arr[index];
            int number = (int) (ch) - (int) ('0');
            int target = change[number];
            if (target > number) {
                sb.append(target);
                flag = false;
            } else if (target == number || flag) {
                sb.append(number);
            } else {
                break;
            }
            index++;
        }
        for (int i = index; i < arr.length; i++) {
            char ch = arr[i];
            int number = (int) ch - (int) ('0');
            sb.append(number);
        }
        return sb.toString();
    }
}
