package arrays;

public class TwoArrays {
    public static void main(String[] args) {
        TwoArraySep();
    }

    public static void TwoArraySep() {
        int Number;
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < number.length; i++) {
            if (number.length / 2 >= i) {
                Number = number[i];
                System.out.print(Number + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < number.length; i++) {
            if (number.length / 2 < i) {
                Number = number[i];
                System.out.print(Number + ",");


            }
        }
    }
}

