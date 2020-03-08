package review;

public class ArrayChartotal {
    public static void main(String[] args) {
char []arr= {'T', 'o', 'd', 'a', 'y', '\0', 'i', 's','\0',
                        'f','u','n','\0','d','a','y','\1'
};
        System.out.println(arr);
        System.out.println(characters(arr));

    }
    public static int characters(char[] arr){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!='\0'|| arr[i]!='\1'){
                count+=1;
            }
        }
        return count;
    }
}
