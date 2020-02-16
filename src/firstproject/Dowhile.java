package firstproject;

public class Dowhile {
    public static void main(String[] args) {
        int counter=10;
        do{
            System.out.println("counter :"+ counter);
            counter++;
        }
        while (counter<=10);
        System.out.println("With While loop");
        int counter2=10;
        while (counter2<=10){
            System.out.println(counter2);
            counter2++;
        }
    }
}
