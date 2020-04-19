package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class StringDuplucateRemoving {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>(Arrays.asList("a","asasd","sdaesd","dfd","a","fdef","asasd"));
        ArrayList<String> newList = new ArrayList<>();
        for(String element:arr){
            if(!newList.contains(element)){
                newList.add(element);
            }
        }
        System.out.println(newList);
    }
}
