package methods;

import java.util.Scanner;
public class PasswordCheck {
    public static void PasswordCheck(String password) {

        if (password.length() >= 6) {
            System.out.println("Password is ok");
        } else if (!(password.length() >= 6)) {
            System.out.println("Please enter password as least 6 characters");
        }
    }

    public static String passCheck(String password) {
        String result;
        if (password.length() >= 6) {
            result = "ok";
        } else {
            result = "Not ok";

        }
        return result;
    }
    public static boolean isPasswordCheck(String password) {
        boolean result;
        if (password.length() < 6) {
            result = false;
        } else {
            result = true;
        }
        return result;



    }




    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = p.next();
        PasswordCheck(password);
        String chek= passCheck(password);
        System.out.println(chek);
        System.out.println(isPasswordCheck(password));
        //String password = "351681464168";
        if (isPasswordCheck(password)) {
            System.out.println("Lenth is ok");
        }
    }
}
