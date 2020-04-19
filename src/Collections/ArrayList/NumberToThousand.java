package Collections.ArrayList;

import java.util.ArrayList;

public class NumberToThousand {
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i <=1000; i++) {
            numbers.add(i);
        }

        //System.out.println(numbers);

        for (int number:numbers){
            System.out.println(number);
        }

    }



}
