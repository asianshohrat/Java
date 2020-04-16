package ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class CharArrayList {
    public static void main(String[] args) {

        String sentence ="java is fun";
        ArrayList<Character> myLetters =new ArrayList<>();
        for (int i = 0; i < sentence.length(); i++) {
            myLetters.add(sentence.charAt(i));
        }

        System.out.print(myLetters);
    }
}
