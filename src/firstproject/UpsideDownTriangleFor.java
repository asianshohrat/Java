package firstproject;

public class UpsideDownTriangleFor {
    public static void main(String[] args) {
        for (int i=20;i>=1;i--){
            for(int j=1; j<=i; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
