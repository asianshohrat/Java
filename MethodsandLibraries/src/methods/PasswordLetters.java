package methods;

public class PasswordLetters {
    public static void main(String[] args) {
//LetterMethod();
    }
/*
    public static void LetterMethod() {
        for (int i = 0; i <= 5; i++) {
            int one = 97 + (int) (Math.random() * 26);
            System.out.print((char) one);
        }
    }

 */
public static void generateLetterPass(int passlen) {
    for (int i=0; i<passlen; i++){
        System.out.println((char)(97 + (int) (Math.random() * 26)));
    }

}
}

