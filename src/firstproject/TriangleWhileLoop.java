package firstproject;

public class TriangleWhileLoop {
    public static void main(String[] args) {
        int i=0;
        while(i<17){
            int j=0;
            while (j<=i){
                System.out.print("*  ");
                j++;
            }System.out.println();
            i++;
        }

    }
}
