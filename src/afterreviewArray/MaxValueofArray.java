package afterreviewArray;

public class MaxValueofArray {
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6}};

        printMax(arr);
    }

    public static void printMax(int[][] arr){
        int max;

        for (int i = 0 ; i < arr.length ; i++){
            max = 0;
            for (int j = 0 ; j < arr[i].length ; j++) {
                if (arr[i][j] > max)
                    max = arr[i][j];
            }
            System.out.println("row "+i+"max number "+max);
        }

    }
}
