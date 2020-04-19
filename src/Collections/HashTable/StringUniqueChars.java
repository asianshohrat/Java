package Collections.HashTable;

import java.util.HashSet;

public class StringUniqueChars {
    public static void main(String[] args) {
        String word = "abcde";
        System.out.println(isAllCharUnique(word));
        System.out.println(isAllCharUnique(word,true));

    }
    public static boolean isAllCharUnique(String word){
        HashSet<Character> chars = new HashSet<>();
        for (int i = 0; i < word.length() ; i++) {
            chars.add(word.charAt(i));
        }

        if(word.length()==chars.size()) {
            return true;
        }
        else{
            return false;
        }
    }
    //approach 2
    public static boolean isAllCharUnique(String word,boolean x){
        HashSet<Character> chars = new HashSet<>();
        boolean result = true;
        for (int i = 0; i < word.length() ; i++) {
            if(!chars.add(word.charAt(i))){
                result=false;
            }
        }
        return result;
    }
}