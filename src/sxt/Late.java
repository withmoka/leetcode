/**
 * Late 类
 * @version 1.0
 * @author momoka
 * 根据迟到时间来计算得到罚款以及反馈。
 */

package sxt;

public class Late {

    public static void main(String[] args) {
        helper("张三", 6900, 30);
    }

    public static int helper(String name, int monthSalary, int time) {
        int fine = 0;
        if (time >= 1 && time <= 10) {
            System.out.println(name + ", You are late!");
        } else if (time <= 20) {
            fine = 100;
            System.out.println("Fine is " + fine + " yuan.");
        } else if (time <= 30) {
            fine = 200;
            System.out.println("Fine is " + fine + " yuan.");
        } else if (time <= 60) {
            fine = (int) (1.0 * monthSalary / 30 * 0.5);
            System.out.println("Fine is " + fine + " yuan.");
        } else {
            fine = (int) (1.0 * monthSalary / 30 * 3);
            System.out.println("Fine is " + fine + " yuan.");
        }
        return fine;
    }
}
