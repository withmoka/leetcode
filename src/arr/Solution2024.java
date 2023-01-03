package arr;

public class Solution2024 {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        char[] arr = answerKey.toCharArray();
        int left = 0;
        int right = 0;
        int n = arr.length;
        int numT = 0;
        int numF = 0;
        int res = 0;
        while (right < n) {
            if (arr[right] == 'T') {
                numT++;
            } else {
                numF++;
            }
            if (numT > k && numF > k) {
                if (arr[left] == 'T') {
                    numT--;
                } else {
                    numF--;
                }
                left++;
            }
            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;
    }
}
