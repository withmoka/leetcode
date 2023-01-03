package arr;

public class Solution2038 {
    public static boolean winnerOfGame(String colors) {
        String cp = new String(colors);
        int len = colors.length();
        int count_a = 0;
        int count_b = 0;
        boolean flag = true;
        for(int i = 0;i<len-2;i++){
            String sub = colors.substring(i,i+3);
            if (sub.equals("AAA")){
                count_a++;
            } else if (sub.equals("BBB")){
                count_b++;
            }
        }
//        while (colors.contains("AAA")) {
//            count_a++;
//            colors = colors.replaceFirst("AAA", "AA");
//        }
//        while (cp.contains("BBB")) {
//            count_b++;
//            cp = cp.replaceFirst("BBB", "BB");
//        }
        if (count_a <= count_b) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "AAABABB";
        boolean res = winnerOfGame(s);
        System.out.println(res);
    }
}
