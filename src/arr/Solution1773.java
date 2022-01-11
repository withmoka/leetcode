package arr;

import java.util.List;

public class Solution1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> item : items) {
            String type = item.get(0);
            String color = item.get(1);
            String name = item.get(2);
            if (ruleKey.equals("type") && ruleValue.equals(type)) {
                count++;
            }
            if (ruleKey.equals("color") && ruleValue.equals(color)) {
                count++;
            }
            if (ruleKey.equals("name") && ruleValue.equals(name)) {
                count++;
            }
        }
        return count;
    }
}
