package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random rnd = new Random();
        //System.out.println(rnd.nextInt(1000));
        for (int i = 0; i < 10; i++) {
            arr.add(rnd.nextInt(1000));

        }
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println("min number is: "+arr.get(0));
        System.out.println("max : " + arr.get(arr.size()-1));
        System.out.println("Median : " + arr.size()/2);
    }
}
