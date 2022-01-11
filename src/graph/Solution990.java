package graph;

import java.util.HashMap;

public class Solution990 {
    public boolean equationsPossible(String[] equations) {
        DSU dsu = new DSU(26);
        for (String equation : equations) {
            char first = equation.charAt(0);
            char charge = equation.charAt(1);
            char second = equation.charAt(3);
            if (charge == '=') {
                dsu.union(first - 97, second - 97);
            }
        }
        for (String equation : equations) {
            char first = equation.charAt(0);
            char charge = equation.charAt(1);
            char second = equation.charAt(3);
            if (charge == '!') {
                if (dsu.find(first - 97) == dsu.find(second - 97)) {
                    return false;
                }
            }
        }
        return true;
    }
}
