package arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1243 {
    public List<Integer> transformArray(int[] arr) {
        List<Integer> list = new ArrayList<>();
        if (arr.length == 1 || arr.length == 2) {
            for (int ele : arr) {
                list.add(ele);
            }
            return list;
        }
        int[] temp = Arrays.copyOf(arr, arr.length);
        boolean inc = false;
        boolean dec = false;
        do {
            inc = false;
            dec = false;
            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                    temp[i]++;
                    inc = true;
                }
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    temp[i]--;
                    dec = true;
                }
            }
            arr = Arrays.copyOf(temp, temp.length);
        } while (inc || dec);
        for (int num : arr) {
            list.add(num);
        }
        return list;
    }
}
