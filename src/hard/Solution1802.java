package hard;

public class Solution1802 {
    public static int maxValue(int n, int index, int maxSum) {
        for (long i = maxSum; i > 0; i--) {
            long res = getSum(n, index, i);
            if (res <= maxSum) {
                return (int)i;
            }
        }
        return 0;
    }

    public static long getSum(int n, int index, long Med) {
        // 左边元素个数（包含Med）index+1 确定的
        // 最大值是Med 确定的
        long sumL = 0;
        // 够降的情况 med=3 [1,2,3] 长度为3，如果长度为4，就不够降了 med=3 长度为2 2,3 也是可以的
        // [2,3,4,5] med=5 index+1=4 begin =
        if (Med>=index+1){
            long begin = Med-(index+1)+1;
            long end = Med;
            sumL = (begin+end)*(index+1)/2;
        }else {
            long begin = 1;
            long end = Med;
            sumL = (begin+end)*(index+1)/2;
            sumL +=index+1-Med;
        }
        // 右边元素个数 n-index
        long sumR = 0;
        if (Med>=n-index){
            long begin = Med-(n-index)+1;
            long end = Med;
            sumR = (begin+end)*(n-index)/2;
        }else {
            long begin = 1;
            long end = Med;
            sumR = (begin+end)*(n-index)/2;
            sumR +=n-index-Med;
        }
        return sumL + sumR - Med;
    }

    public static void main(String[] args) {
        int sum = maxValue(3, 0, 815094800);
        long res = getSum(4,2,6);
        System.out.println(res);
        System.out.println(sum);
        // [4,5,6,5]
        // 271698267
//        System.out.println(sum);
    }
}
