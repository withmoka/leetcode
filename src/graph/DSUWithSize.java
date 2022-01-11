package graph;

import java.util.Arrays;

class DSUWithSize {
    int[] parent;
    int[] size;

    public DSUWithSize(int N) {
        parent = new int[N];
        size = new int[N];
        for (int i = 0; i < N; i++) {
            parent[i] = i;
        }
        Arrays.fill(size, 1);
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX == rootY) {
            return;
        }
        if (size[rootX] < size[rootY]) {
            parent[rootX] = rootY;
            size[rootY] = size[rootY] + size[rootX];
        } else {
            parent[rootY] = rootX;
            size[rootX] = size[rootX] + size[rootY];
        }
    }

    public int getMaxSize() {
        int max = 0;
        for (int i = 0; i < size.length; i++) {
            max = Math.max(max, size[i]);
        }
        return max;
    }
}
