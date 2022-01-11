package heap;

import java.util.PriorityQueue;

public class KthLargest {

    final PriorityQueue<Integer> queue;
    final int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue<>(k);
        for (int i : nums) {
            add(i);
        }
    }

    public int add(int val) {
        if (queue.size() < k) {
            queue.offer(val);
        } else if (queue.peek() < val) {
            queue.poll();
            queue.offer(val);
        }
        return queue.peek();
    }

    //add也可以用于初始构造堆
    //先扔k个进去，小根堆构造完毕
    //再加元素，比堆顶都小的，不要。
    //比堆顶大的，放进来，前提是堆顶的先t出去
    //这样子，堆中的就是最大的k个元素
    //堆顶最小，所以堆顶是第k大元素
}
