package arrays;

public class ArrayFindOdd {
    public static void main(String[] args) {
        FindOdd();
    }

    public static void FindOdd() {

int Odd=0;
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 1) {
                Odd = number[i];
                System.out.println(Odd);
            }
        }

    }
}
