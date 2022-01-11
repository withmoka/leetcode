package arr;

public class Solution5193 {
    public String makeFancyString(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]);
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
                if (count < 3) {
                    sb.append(arr[i]);
                }
            } else {
                count = 1;
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
}
