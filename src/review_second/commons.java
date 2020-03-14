package review_second;

public class commons {
    public static void main(String[] args) {
        int numbers1[] = {1,2,3,4,5,6,7,8,9};
        int numbers2[]={4,5,99,10,7,77,88};
        printCommons(numbers1,numbers2);
    }
    public static void printCommons(int arr1[],int arr2[]){
        for(int i=0 ; i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}

