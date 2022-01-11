package arr;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution1426 {
    public int countElements(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int count = 0;
        for (int num : arr) {
            if (list.contains(num + 1)) {
                count++;
            }
        }
        return count;
    }
}
