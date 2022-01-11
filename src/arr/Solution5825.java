package arr;

import java.util.ArrayList;
import java.util.List;

public class Solution5825 {
    public int maxCompatibilitySum(int[][] students, int[][] mentors) {
        int max = Integer.MIN_VALUE;
        int m = students.length;
        int[] nums = new int[m];
        for (int i = 0; i < m; i++) {
            nums[i] = i;
        }
        List<List<Integer>> res = new ArrayList<>();
        for (List<Integer> ele : res) {
            int sum = 0;
            for (int i = 0; i < m; i++) {
                int[] student = students[i];
                int[] mentor = mentors[ele.get(i)];
                int grade = gerGrade(student, mentor);
                sum += grade;
            }
            max = Math.max(max, sum);
        }
        return max;
    }


    public int gerGrade(int[] student, int[] mentor) {
        int sum = 0;
        for (int i = 0; i < student.length; i++) {
            if (student[i] == mentor[i]) {
                sum++;
            }
        }
        return sum;
    }
}
