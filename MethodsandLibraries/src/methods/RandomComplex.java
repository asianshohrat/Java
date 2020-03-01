package methods;

public class RandomComplex {
    public static void main(String[] args) {
        generateLetterPass(6);
    }

    public static void generateLetterPass(int passlen) {
        for (int i = 0; i < (passlen -4); i++) {
            System.out.print((char) (65 + (int) (Math.random() * 26)));
        }

        for (int j = 0; j < 2; j++) {
            System.out.print((char) (97 + (int) (Math.random() * 26)));
        }
        for (int k = 0; k < 1; k++) {
            System.out.print((char) (33 + (int) (Math.random() * 30)));

        for(int l =0; l<1;l++){
            System.out.print((int) (Math.random() * 10));
        }





    }


    }

}
