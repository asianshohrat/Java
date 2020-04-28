package Collections.review;

import java.util.Map;
import java.util.TreeMap;

public class CharOccur {public static void main (String[] args ) {
    Map<Character,Integer> frekans =new TreeMap<Character, Integer>(  );
    String sentence="java";
    for ( int i = 0 ; i < sentence.length () ; i++ ) {
        char c = sentence.charAt ( i );
        if ( frekans.containsKey ( c ) ) {
            frekans.replace ( c , frekans.get ( c ) + 1 );
        }
        else {
            frekans.put ( c , 1 );
        }
    }
    for(Map.Entry<Character,Integer> entry: frekans.entrySet ()){
        System.out.println (entry.getKey ()+" " +entry.getValue ());
    }
}
}