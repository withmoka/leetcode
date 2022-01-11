package arr;

public class Solution1528 {
    public String restoreString(String s, int[] indices) {
        char[] arr = s.toCharArray();
        char[] temp = new char[arr.length];
        int num = 0;
        for (int index : indices) {
            temp[index] = arr[num];
            num++;
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : temp) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
