package methods;

public class PrintASCII {
    public static void ascii(){
        for (int i = 0 ; i<256 ; i++){
            System.out.println((char)i);
        }
    }
    public static void main(String[] args) {
        ascii();
        double a= Math.pow(3,4);
    }
}
