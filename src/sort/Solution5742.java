package sort;

public class Solution5742 {
    public String sortSentence(String s) {
        String[] ss = s.split("\\s+");
        int index = 1;
        StringBuilder sb = new StringBuilder();
        while (index < ss.length + 1) {
            for (String str : ss) {
                if (str.contains(String.valueOf(index))) {
                    sb.append(str.replace(String.valueOf(index), ""));
                    if (index < ss.length) {
                        sb.append(" ");
                    }
                    index++;
                }
            }
        }
        return sb.toString();
    }
}
