package arrays;

public class RandomString {
    public static void main(String[] args) {
        randomString();;
    }
    public static void randomString(){

        int n = (int) (Math.random() * 10) ;

        for (int i = 0; i < n; i++) {
            char Char = (char ) ((int) (Math.random() * 26) + 97);
            System.out.print(Char);
        }
    }
}
