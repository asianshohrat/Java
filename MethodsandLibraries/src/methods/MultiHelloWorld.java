package methods;

public class MultiHelloWorld {
    public static void printMultiHelloWorld(int x){
        for (int i =0; i<x; i++ ){
            System.out.println("hello world");
        }
    }
    public static void main(String[] args) {
        printMultiHelloWorld(15);
    }
}
