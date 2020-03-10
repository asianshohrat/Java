package afterreviewArray;

import java.util.jar.JarOutputStream;

public class MaxValueofArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};



//        System.out.println("----  max numbers ----");
//         max=printMax(arr);}
//
//        System.out.println("----  min numbers ----");
//       { printmin(arr);}
//        System.out.println(printmin(arr));
//
//
//        System.out.println("----  max difference  ----");
//int max, min;
//
//
//        System.out.println("max difference : " +(max-min));


    }

    public static int printMax(int[][] arr) {
        int max=0;

        for (int i = 0; i < arr.length; i++) {
            max = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max)
                    max = arr[i][j];
            }
            System.out.println("row " + i + " max number " + max);
        }
       return max;
    }

    public static int printmin(int[][] arr) {

        int min=0;

        for (int k = 0; k < arr.length; k++) {
            min = 99999;


            for (int l = 0; l < arr[k].length; l++) {
                if (arr[k][l] < min)
                    min = arr[k][l];
            }
           System.out.println("row " + k + " min number " + min);
        }
        return min;
    }
}

