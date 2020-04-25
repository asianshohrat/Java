package Collections.HashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListSecondOccurance {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Java","is","fun","Java","yes","Java","Java","Java"));
        int counter=0;
        int index=0;
        for(int i = 0 ; i < list.size() ; i++ ){
            for (int j = i+1 ; j < list.size() ; j++) {
                if(list.get(i).equals(list.get(j))){
                    counter++;
                    if(counter==2) {
                        index = j;
                    }
                }
            }
        }
        System.out.println(index);
        list.remove(index);
        System.out.println(list);
    }
}