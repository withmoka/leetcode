package str;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution500 {
    public String[] findWords(String[] words) {
        String s1 = "qwertyuiop";
        char[] arr1 = s1.toCharArray();
        Set<Character> set1 = new HashSet<>();
        for (char ch : arr1) {
            set1.add(ch);
        }
        String s2 = "asdfghjkl";
        char[] arr2 = s2.toCharArray();
        Set<Character> set2 = new HashSet<>();
        for (char ch : arr2) {
            set2.add(ch);
        }
        String s3 = "zxcvbnm";
        char[] arr3 = s3.toCharArray();
        Set<Character> set3 = new HashSet<>();
        for (char ch : arr3) {
            set3.add(ch);
        }

        List<String> list = new ArrayList<>();

        for (String word : words) {
            boolean flag = true;
            String str = word.toLowerCase();
            char[] arr = str.toCharArray();
            char first = arr[0];
            if (set1.contains(first)) {
                for (char ch : arr) {
                    if (!set1.contains(ch)) {
                        flag = false;
                        break;
                    }
                }
            }
            if (set2.contains(first)) {
                for (char ch : arr) {
                    if (!set2.contains(ch)) {
                        flag = false;
                        break;
                    }
                }
            }
            if (set3.contains(first)) {
                for (char ch : arr) {
                    if (!set3.contains(ch)) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                list.add(word);
            }
        }

        int len = list.size();
        String[] res = new String[len];
        for (int i = 0; i < len; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
