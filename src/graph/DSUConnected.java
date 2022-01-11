package graph;

class DSUConnected {
    int[] parent;

    public DSUConnected(int N) {
        parent = new int[N];
        for (int i = 0; i < N; i++) {
            parent[i] = i;
        }
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public void union(int x, int y) {
        parent[find(x)] = find(y);
    }

    public boolean isConnected(int x, int y) {
        if (find(x) == find(y)) {
            return true;
        }
        return false;
    }

    public int getSize() {
        int size = 0;
        for (int i = 0; i < parent.length; i++) {
            if (parent[i] == i) {
                size++;
            }
        }
        return size;
    }
}
