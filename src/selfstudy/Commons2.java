package selfstudy;

public class Commons2 {
    public static void main(String[] args) {
int numbers1 []={1,2,3,4,5,6,7,8,9,88,4};
int numbers2[]={4,5,99,10,7,77,88};
printCommons2(numbers1,numbers2);

    }
    public static void printCommons2(int arr1[], int arr2[]){


        for (int i=0; i<arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);

                }

            }
        }

    }
}
