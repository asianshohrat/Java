package HashMap;

import java.util.HashMap;

public class Question1 {
    public static void main(String[] args) {
        HashMap<String, String> myHashMap = new HashMap<>();

        myHashMap.put("Java","medium" );
        myHashMap.put("Sql","Entry");
        myHashMap.put("Selenium","master");
        myHashMap.put("Cucumber","expert");
        System.out.println(myHashMap);
        for (String key: myHashMap.keySet()){
            System.out.println(key+"\t\t\t"+myHashMap.get(key));
        }
    }
}
