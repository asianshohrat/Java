package Collections.ArrayList;

import java.util.ArrayList;

public class RandomCharArrayList {
    public static void main(String[] args) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
        ArrayList<String> words = new ArrayList<>();
        String word;
        for (int i = 0; i < 100; i++) {
            word = "";
            for (int j = 0; j < 5; j++) {
                word += letters.charAt((int) (letters.length() * Math.random()));
            }
            words.add(word);
        }
        System.out.println(words);
    }
}
