package firstproject;

public class NesttedLoopNumbers {
    public static void main(String[] args) {


        for(int i=1; i<=9; i++){

            for (int j=0; j<=9; j++) {

                // filter any number

                    System.out.print(i);
                    System.out.println(j);

                   // filter any number Ex: 31-39
                    if (i == 3) {
                        j = 9; }
            }
        }



        }
}
