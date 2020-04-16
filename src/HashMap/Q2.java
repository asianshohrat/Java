package HashMap;

import java.util.HashMap;

public class Q2 {
    public static void main(String[] args) {
        HashMap<String, Integer> myHashMap = new HashMap<>();

        myHashMap.put("Los Angeles", 85 );
        myHashMap.put("Chcago", 30);
        myHashMap.put("Denver", 55);
        myHashMap.put("Orlando", 90);
        System.out.println(myHashMap);
        for (String key: myHashMap.keySet()){
            System.out.println(key+"\t\t\t"+myHashMap.get(key));

        }
        double average;
        int total=0;
        for (int temp : myHashMap.values()){
            total+=temp;
        }
        average=total/myHashMap.size();
        System.out.format("Average Temperature : %.2f",average);
        }

    }

