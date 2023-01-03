package sxt;

public class Menu {
    int number;
    boolean isSpicy;
    String meat1 = "chicken";
    String meat2 = "beef";
    String vegetable1 = "onion";
    String vegetable2 = "cabbage";

    public Menu(int i, boolean b) {
        super();
        int number = this.number;
        boolean isSpicy = this.isSpicy;
        String meat1 = this.meat1;
        String meat2 = this.meat2;
        String vegetable1 = this.vegetable1;
        String vegetable2 = this.vegetable2;
    }

    public void eat() {
        if (isSpicy) {
            if (number == 2) {
                System.out.println(meat1 + "\t" + vegetable2);
            } else if (number == 1) {
                System.out.println(meat2);
            }
        } else {
            if (number == 2) {
                System.out.println(meat1 + '\t' + vegetable1);
            } else if (number == 1) {
                System.out.println(vegetable1);
            }
        }
    }
}
