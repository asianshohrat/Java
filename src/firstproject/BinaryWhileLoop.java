package firstproject;

public class BinaryWhileLoop {
    public static void main(String[] args) {
        int k, j, i=0;
        while(i<=1){
            j=0;
            while(j<=1){
                k=0;
                while(k<=1){
                    System.out.println(""+i+j+k);
                    k++;
                }
                j++;
            }
            i++;
        }
    }
}

