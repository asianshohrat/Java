package Collections.TreeSEt;
import java.util.HashMap;
import java.util.HashSet;

public class HashSetHackerrank {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        String[] allnames = {"john tom","john mary","john tom","mary anna","mary anna"};
        for(int i=0 ; i<allnames.length ; i++){
            names.add(allnames[i]);
            System.out.println(names.size());
        }
    }

}