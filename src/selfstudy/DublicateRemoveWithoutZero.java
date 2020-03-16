package selfstudy;

import java.util.Arrays;

public class DublicateRemoveWithoutZero {
    private static int countzero;

    public static void main(String[] args) {
        int myArray[] = {1, 2, 3, 4, 5, 67, 4, 3, 7, 7};
        System.out.println(Arrays.toString(removeDuplicateszeros(myArray)));
    }

    public static boolean isItInArray(int value, int[] arr) {
        boolean result = false;
        for (int number : arr) {
            if (number == value) {
                result = true;
            }
        }
        return result;
    }

    public static int[] removeDuplicates(int[] arr) {
        int[] removedDup = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (!isItInArray(arr[i], removedDup)) {
                removedDup[i] = arr[i];

            }
        }
        return removedDup;
    }

    public static int countzero(int[] arr) {
        int countzero = 0;
        int[] removedDup = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if ((removedDup[i] == 0)) {
                countzero++;

            }System.out.println(countzero);
        }
        return countzero;

    }

    public static int[] removeDuplicateszeros(int[] arr) {
        int[] removedDupzero = new int[arr.length - countzero];
        for (int i = 0; i < arr.length; i++) {
            if (!isItInArray(arr[i], removedDupzero)) {
                removedDupzero[i] = arr[i];

            }
        }
        return removedDupzero;

    }
}

