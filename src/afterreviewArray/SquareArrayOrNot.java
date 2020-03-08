package afterreviewArray;

public class SquareArrayOrNot {
    public static void main(String[] args) {
int [][] myArr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(checkSquare(myArr));

    }


    public static boolean checkSquare (int[][] arr){
        boolean square=true;
        for (int i = 0 ; i <arr.length ; i++){
            if (arr.length != arr[i].length)
                square=false;
        }

        return square;
    }
}
