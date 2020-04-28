package Collections.review;

import java.util.HashMap;

public class WordOccur {
    public static void main(String[] args) {
        HashMap<String, Integer> number = new HashMap<String, Integer>();
        String[] arr = {"Java", "Java", "enough", "for", "today"};
        for (String i : arr) {
            if (number.containsKey(i)) {
                number.put(i, number.get(i) + 1);
            } else {
                number.put(i, +1);
            }
        }
        for (String key : number.keySet()) {
            System.out.println("occurrence of '" + key + "' is  " + number.get(key));
        }
    }
}

