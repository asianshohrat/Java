package arrays;

public class ArrayEvenSum {
    public static void main(String[] args) {

        int print = sumValues();
        System.out.println(print);
    }

    public static int sumValues() {
        int sum = 0;

        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                sum += number[i];
            }
        }
        return sum;

    }
}

