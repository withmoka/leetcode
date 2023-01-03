package week;

public class Solution6028 {
    public static int countCollisions(String directions) {
        int count = 0;
        char[] arr = directions.toCharArray();
        int len = arr.length;
        for (int i = 0; i < len ; i++) {
            char a = arr[i];
            if (a == 'R') {
                for (int right = i + 1; right < len; right++) {
                    if (arr[right] == 'L') {
                        count += 2;
                        arr[i] = 'S';
                        arr[right] = 'S';
                        break;
                    } else {
                        break;
                    }
                }
            } else if (a == 'L') {
                for (int left = i - 1; left >= 0; left--) {
                    if (arr[left] == 'R') {
                        count += 2;
                        arr[i] = 'S';
                        arr[left] = 'S';
                        break;
                    } else {
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < len ; i++) {
            char a = arr[i];
            if (a == 'R') {
                for (int right = i + 1; right < len; right++) {
                    if (arr[right] == 'S') {
                        count++;
                        arr[i] = 'S';
                        arr[right] = 'S';
                        break;
                    } else if (arr[right] == 'L') {
                        count += 2;
                        arr[i] = 'S';
                        arr[right] = 'S';
                        break;
                    } else {
                        break;
                    }
                }
            } else if (a == 'L') {
                for (int left = i - 1; left >= 0; left--) {
                    if (arr[left] == 'S') {
                        count++;
                        arr[i] = 'S';
                        break;
                    } else if (arr[left] == 'R') {
                        count += 2;
                        arr[i] = 'S';
                        arr[left] = 'S';
                        break;
                    } else {
                        break;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "SSRSSRLLRSLLRSRSSRLRRRRLLRRLSSRR";
//        String s = "RLRSLL";
        int res = countCollisions(s);
        System.out.println(res);
    }
}
