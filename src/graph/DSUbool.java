package graph;

class DSUbool {
    int[] parent;

    public DSUbool(int N) {
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

    public boolean union(int x, int y) {
        if (find(x) != find(y)) {
            parent[find(x)] = find(y);
            return true;
        }
        return false;
    }
}