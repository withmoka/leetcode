package dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution690 {

    Map<Integer, Employee> map = new HashMap<>();

    public int getImportance(List<Employee> employees, int id) {
        for (Employee e : employees) {
            map.put(e.id, e);
        }
        int res = dfs(id);
        return res;
    }

    public int dfs(int id) {
        int total = 0;
        Employee e = map.get(id);
        int value = e.importance;
        total += value;
        List<Integer> idList = e.subordinates;
        for (int i : idList) {
            total += dfs(i);
        }
        return total;
    }
}
