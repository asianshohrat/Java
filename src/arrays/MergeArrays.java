package arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int myArray1[] = {1, 2, 3,};
        int myArray2[] = {4, 5, 6};
        MergeArray2(myArray1,myArray2);
    }

    public static void MergeArray2(int myArray1[],int myArray2[]) {
        int length = myArray1.length + myArray2.length;
        int[] mergedArray = new int[length];

        for (int i = 0; i < myArray1.length; i++) {
            mergedArray [i]=myArray1[i];

        }
       int  index=0;
            for (int j = (myArray1.length); j < (mergedArray.length); j++) {
                mergedArray [j]=myArray2[index];
index ++;

            }
        for (int k = 0; k < (mergedArray.length); k++) {

            System.out.print(mergedArray[k]+",");
        }




    }
}
