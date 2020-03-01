package arrays;

public class ArrayMin {

        public static void main(String[] args) {
            int arrayNumbers[]={99,745,2,0,-0};
            System.out.println(findMin(arrayNumbers));
        }

        static int findMin(int [] arr){
            int min=arr[0];

            for(int i=1 ; i<arr.length;i++){

                if(arr[i]<min){

                    min=arr[i];
                }
            }
            return min;
        }

    }
