package arrays;

public class FindMaxElementofArray {
    public static void main(String[] args) {
        int myArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 56, 256, 55, 65, 985, 626, 99};
        MaxElement(myArray);
    }


    public static void MaxElement(int myArray[]) {

        int max = 0;

        for (int j = 0; j < myArray.length; j++) {

            if (max <= myArray[j]) {
                max = myArray[j];
            }

        }System.out.print(max);
    }
}
