package exam;

public class Solution4_9 {
    // 加满油以后可以开n公里
    public static void helper(int n, int[] arr) {
        int count = 0;
        // 检查有没有根本无法到达的情况
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > n) {
                System.out.println("No Solution!");
                return;
            }
        }
        for (int i = 0, temp = 0; i < arr.length; i++) {
            temp += arr[i];
            // 超标，需要加油，初始值从这个超标值开始算
            if (temp > n) {
                count += 1;
                temp = arr[i];
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        // 最后一个值表示终点距离最后一个加油站的距离。
        int[] arr = {1, 2, 3, 4, 5, 1, 6, 6};
        // 1+2+3+4，超了，加油 temp = 4
        // 4+5，超了，加油 temp = 5
        // 5+1+6，超了，加油 temp = 6，temp+arr[i]的i在上一轮的i的后面继续加
        // 6+6，超了，加油 temp = 6
        // 6 到达。一共加了4次油 没有i了，结束
        helper(7,arr);
    }
}
