package str;

public class SolutionLCP17 {
    public int calculate(String s) {
        int x = 1;
        int y = 0;
        char[] arr = s.toCharArray();
        for (char ch : arr) {
            if (ch == 'A') {
                x = 2 * x + y;
            } else {
                y = 2 * y + x;
            }
        }
        return x + y;
    }
}
