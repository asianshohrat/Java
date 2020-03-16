package creating_classes;

public class Printing {
    public static void main(String[] args) {
        printString();
        printString("Java ");
        printString("I love Java",50);
    }
    public static void printString(){
        for(int i=0;i<100;i++){
            System.out.println("Hello World");
        }
    }
    public static void printString(String word){
        for (int i = 0; i < 100 ; i++) {
            System.out.println(word);
        }
    }
    public static void printString(String word,int number){
        for (int i = 0; i < number ; i++) {
            System.out.println(word);
        }
    }
}
