package firstproject;

import org.w3c.dom.ls.LSOutput;

public class TurnerOperator {
    public static void main(String[] args) {
        int age=4;
        String action="";
        if(age>25) {
            action = "Go to work";
        }else if (age>18){
            action="go to Collage";
        }else{
            action="go to school";
        }
        action=age>25?"Go to work" : "Go to School";

        action=age>25 ?"Go to Work":age>18?"Go to Collage":"Go to School";
        System.out.println(action);
    }


}
