package Exceptions;

public class ArrayFinally {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3,4},{5,6},{7,8,9}};
        int[][] arr2 = new int[arr1.length][arr1[0].length];
        try {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[0].length; j++) {
                    arr2[i][j] = arr1[j][i];
                }
            }
        }
        catch (Exception e){
            System.out.println("error");
        }
        finally {
            System.out.println("Hello word");
        }
    }

}
