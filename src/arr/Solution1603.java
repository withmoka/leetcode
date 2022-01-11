package arr;

class Solution1603 {

    int big, medium, small;

    public Solution1603(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1) {
            if (big > 0) {
                big--;
                return true;
            }
        }
        if (carType == 2) {
            if (medium > 0) {
                medium--;
                return true;
            }
        }
        if (carType == 3) {
            if (small > 0) {
                small--;
                return true;
            }
        }
        return false;
    }
}
