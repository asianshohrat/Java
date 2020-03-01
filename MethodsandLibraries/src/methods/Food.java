package methods;

import java.awt.*;

public class Food {
    public static void main(String[] args) {

    }

    public static void Number() {
        String Choice;
        int number=0;
        for (int i = 1; i <= 3; i++) {
            number=((int) (Math.random() * 10)+1);
        }

        if (number==1){
            Choice="Soup";

        }if (number==2){
            Choice="Eat Hamburger";

        }
        else
            Choice= "bye bye";

    }
}
