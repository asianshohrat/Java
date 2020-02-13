package firstproject;
import java.sql.SQLOutput;
import java.util.Scanner;
public class UserLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter starting Point : ");
        int s=scanner.nextInt();
        System.out.print("please enter end number : ");
        int e=scanner.nextInt();
        System.out.println("Please enter what to write : ");
        String w=scanner.next();
        for (int i=s; i<=e; i++ ) {
            System.out.print(w+" ");
        }
    }
}
