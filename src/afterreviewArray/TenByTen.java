package afterreviewArray;

public class TenByTen {
    public static void main(String[] args) {
        int[][] a= createIntArray(10,10);
        printArray(a);
    }

    public static int[][] createIntArray(int rows, int cols){
        int[][] arr = new int [rows][cols];
        int counter = 1;
    for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j <arr[i].length ; j++) {
                arr[i][j] = counter;
                counter ++;
            }
        }
        return arr;
    }

    public static void printArray(int[][] arr){

        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j <= i ; j++) {

                System.out.print( arr[i][j]+" ");

            }
            System.out.println();
        }
    }
}
