package arrays;

public class SumArrayRowsandColumns {
    public static void main(String[] args) {
        int[][] numbers = TenByTenArray.generateArray(3);
        printRowSums(numbers);
        printcolumnSums(numbers);

    }
// Adding all Rows
    public static void printRowSums(int[][] arr){
        for(int i=0 ; i<arr.length ; i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
            }
            System.out.println("Sum of row "+(int)(i+1)+" : "+sum);
        }
    }
    //Adding all columns
    public static void printcolumnSums(int[][] arr){

        for(int i=0 ; i<arr.length ; i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[j][i];
            }
            System.out.println("Sum of column "+(int)(i+1)+" : "+sum);
        }
    }



}
