package Collections.TreeSEt;
import java.util.ArrayList;
import java.util.Scanner;

public class HackerRankArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int number=1;
        while(number!=0){
            System.out.print("Enter number : ");
            number=scan.nextInt();
            arr.add(number);
            System.out.println(arr);
        }

    }
}