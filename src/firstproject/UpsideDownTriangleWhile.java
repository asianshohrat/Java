package firstproject;

public class UpsideDownTriangleWhile {
    public static void main(String[] args) {
        int i=20;
        while (1<i){
            int j=1;
            i--;
            while (j<=i){
                System.out.print("*  ");
                j++;
            }
            System.out.println();
        }
    }
}
