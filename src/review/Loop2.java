package review;

public class Loop2 {
    public static void main(String[] args) {
        String  input  = "Java is my Sweetheart";

        int counter = 0 ;

        for (int i = 0 ; i <input.length() ; i++ ){
            char ch = input.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
