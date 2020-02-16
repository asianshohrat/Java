package firstproject;

public class DowhileNumber {
    public static void main(String[] args) {
        float number=100.00f;
        System.out.println("number :"+(int) number);
        do{

            number-=(0.5);
            System.out.println("number: "+ number);

        }while (number>=0.5);
    }
}
