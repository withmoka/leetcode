package arr;

public class Solution6214 {
    public static int getNum(String s) {
        int hour = 0;
        int min = 0;
        int time = 0;
        char a = s.charAt(0);
        char c = s.charAt(3);
        if (a == '0') {
            hour = Integer.parseInt(s.substring(1, 2));
        } else {
            hour = Integer.parseInt(s.substring(0, 2));
        }
        if (c == '0') {
            min = Integer.parseInt(s.substring(3, 4));
        } else {
            min = Integer.parseInt(s.substring(3, 5));
        }
        time = hour * 60 + min;
        return time;
    }

    public static boolean haveConflict(String[] event1, String[] event2) {
        String s1 = event1[0];
        String s2 = event2[0];
        String e1 = event1[1];
        String e2 = event2[1];
        int ss1 = getNum(s1);
        int ee1 = getNum(e1);
        int ss2 = getNum(s2);
        int ee2 = getNum(e2);
        if (ee1 < ss2) {
            return false;
        } else if (ee2 < ss1) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] event1 = new String[2];
        event1[0] = "10:00";
        event1[1] = "11:00";
        String[] event2 = new String[2];
        event2[0] = "14:00";
        event2[1] = "15:00";
        boolean res = haveConflict(event1, event2);
        System.out.println(res);

    }
}
