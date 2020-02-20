package firstproject;

public class UpsidedownTriangleDoWhile {
    public static void main(String[] args) {
        int i=20;
        do {
            int j = 0;
            do {
                System.out.print("*  ");
                j++;
            } while (j < i);
                System.out.println();
                i--;
            }
            while (i >= 0);


    }
}
