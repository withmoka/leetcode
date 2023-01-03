package dfs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution690Again {
    Map<Integer, Employee> map = new HashMap<>();

    public int getImportance(List<Employee> employees, int id) {
        for (Employee e : employees) {
            map.put(e.id, e);
        }
        int res = dfs(id);
        return res;
    }

    public int dfs(int startID) {
        int total = 0;
        Employee cur = map.get(startID);
        int value = cur.importance;
        total += value;
        List<Integer> subordinates = cur.subordinates;
        for (int kidID : subordinates) {
            total += dfs(kidID);
        }
        return total;
    }
}
