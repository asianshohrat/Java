package arrays;

public class RandomArray {
    public static void main(String[] args) {
        System.out.print("{");

        createdRandomIntegerArray(9);
        System.out.println("}");
    }

    public static void createdRandomIntegerArray(int n) {
        int[] Array = new int[n];
        for (int i = 0; i < n; i++) {
            Array[i] = (int) (Math.random() * (200 - 100)) + 100;
        }

        for (int number : Array) {
            System.out.println(number);
        }
    }
}
