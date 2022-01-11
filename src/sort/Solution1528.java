package sort;

public class Solution1528 {
    public String restoreString(String s, int[] indices) {
        char[] arr = s.toCharArray();
        int len = indices.length;
        char[] res = new char[len];
        for (int i = 0; i < len; i++) {
            res[indices[i]] = arr[i];
        }
        return new String(res);
    }
}
