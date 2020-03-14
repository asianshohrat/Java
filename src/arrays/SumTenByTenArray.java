package arrays;

public class SumTenByTenArray {
    public static void main(String[] args) {

        int[][] myNumbers = generateArray(3);
        printArrayElements(myNumbers);
    }

    public static int[][] generateArray (int arraySize){

        int counter = 1;
        int[][] arr = new int[arraySize][arraySize];
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum=sum+arr[i][j];
                arr[i][j] = counter;
                counter++;
            }
            System.out.println(sum);
        }
        return arr;
    }

    public static void printArrayElements ( int[][] arr){

        for (int[] numberArray : arr) {

            for (int number : numberArray) {

                System.out.format("%5d", number);

            }
            System.out.println();
        }
    }
}

