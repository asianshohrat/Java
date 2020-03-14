package arrays;

public class ArraywithMethod {

           public static void main(String[] args) {
               System.out.print("{");
            createdRandomIntegerArray(5);
               System.out.println("}");
        }
        public static void  createdRandomIntegerArray(int n){
            int[] Array=new int[n];
            for (int i=0; i<n; i++) {
                Array[i] = (int) (Math.random() * (5000-1000)) + 1000;
                System.out.print(Array[i] + ",");
            }
        }
}
