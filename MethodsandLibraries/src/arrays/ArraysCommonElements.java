package arrays;

public class ArraysCommonElements {


        public static void main(String[] args) {
Commonelement();
        }

        public static void Commonelement(){
            int myArray1[] = {1,2,3,4,5,6,7,8,9,56,256,55,65,985,626,99};
            int myArray2[] = {5,7,12,99,4,55,67,8,99,5};


                for (int i=0;i<myArray1.length;i++) {
                    for (int j = 0; j < myArray2.length; j++) {
                        if (myArray1[i] == myArray2[j]) {
                            System.out.print(myArray1[i]+",");
                        }
                    }
                }

        }
}
