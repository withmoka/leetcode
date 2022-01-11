package arr;

public class SolutionOffer53 {
    public int search(int[] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                count++;
            } else if (nums[i] > target) {
                break;
            }
        }
        return count;
    }
}
