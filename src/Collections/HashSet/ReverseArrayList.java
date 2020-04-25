package Collections.HashSet;

import java.util.*;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        Collections.sort(arr, Comparator.reverseOrder());
        System.out.println(arr);

        List<String> fruits = new ArrayList<>(List.of("Apple","Banana","Peach","Strawberry"));
        Collections.sort(fruits,Comparator.reverseOrder());
        System.out.println(fruits);


        String x="";
        for(int i=0 ; i < fruits.size() ; i++) {
            StringBuilder reversed = new StringBuilder(fruits.get(i));
            reversed.reverse();
            reversed.toString();
            x+=reversed;
            fruits.set(i,x);
            x="";
        }
        System.out.println(fruits);
    }

    }

