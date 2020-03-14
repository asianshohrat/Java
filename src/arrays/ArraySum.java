package arrays;

public class ArraySum {

        public static void main(String[] args) {

             int print= sumValues();
            System.out.println(print);
        }
        public static int sumValues(){
            int sum =0;
            int [] number = {1,2,3,4,5,6,7};
            for (int i = 0; i <number.length ; i++) {
                sum+=number[i];
            }
           return sum;
        }
    }

