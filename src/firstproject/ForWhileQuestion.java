package firstproject;

public class ForWhileQuestion {
    public static void main(String[] args) {

        int number=0;
       for(int i=1; i<=3;i++){

        for(int j=1; j<=4;j++) {
            number+=2;
            System.out.print(number + "\t");
           }
       System.out.println();
       }

        System.out.println();
        System.out.println();
        System.out.println("for and while");

        int number2=1;
        int counter;
        for (int i = 1; i <= 3; i++) {
            counter=1;
            while (counter < 6) {
                System.out.print(number2 + "\t");
                number2++;
                counter++;
            }
            System.out.println();
        }
    }
}

