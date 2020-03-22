package Inheritance;

public class ArraysTest {
    public static void main(String[] args) {
        ArrayOps myArr = new ArrayOps();
        int[] arr = {1,2,3,4,15,6,7,7,8};
        int index=myArr.findIndex(arr,7);
        System.out.println(index);
        ArraysStats myStat = new ArraysStats(arr);
        System.out.println(myStat.findAverage());
        System.out.println(myStat.findMax());
        int maxIndex=myStat.findMaxIndex();
        System.out.println(maxIndex);
    }
}