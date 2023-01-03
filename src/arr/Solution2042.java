package arr;

import java.util.ArrayList;

public class Solution2042 {
    public boolean isNum(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean areNumbersAscending(String s) {
        String[] arr = s.split("\\s+");
        ArrayList<Integer> list = new ArrayList<>();
        for (String a : arr) {
            if (isNum(a)) {
                list.add(Integer.valueOf(a));
            }
        }
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
