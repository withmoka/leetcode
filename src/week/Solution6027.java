package week;

public class Solution6027 {
    public static int countHillValley(int[] nums) {
        boolean[] arr = new boolean[nums.length];
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == nums[i - 1]) {
                arr[i] = arr[i - 1];
                continue;
            }
            for (int left = i - 1; left >= 0; left--) {
                boolean flag = false;
                if (nums[left] < nums[i]) {
                    flag = true;
                    for (int right = i + 1; right < nums.length; right++) {
                        if (nums[right] < nums[i]) {
                            arr[i] = true;
                            break;
                        } else if (nums[right] > nums[i]) {
                            break;
                        }
                    }
                } else if (nums[left] > nums[i]) {
                    flag = true;
                    for (int right = i + 1; right < nums.length; right++) {
                        if (nums[right] > nums[i]) {
                            arr[i] = true;
                            break;
                        } else if (nums[right] < nums[i]) {
                            break;
                        }
                    }
                }
                if (flag) {
                    break;
                }
            }
        }
        int count = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i]) {
                count++;
                if (nums[i] == nums[i - 1]) {
                    count--;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 4, 1, 1, 6, 5};
        int res = countHillValley(nums);
        System.out.println(res);
    }
}
