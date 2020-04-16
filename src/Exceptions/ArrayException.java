package Exceptions;
import java.util.Scanner;
public class ArrayException {

        public static void main(String[] args) {
            Scanner x=new Scanner(System.in);
            System.out.print("Dividend: ");
            int a=x.nextInt();
            System.out.print("Divisor: ");
            int b=x.nextInt();
            divideTwoNumbers(a,b);
            giveMeValue(a,b);
        }
        public static void divideTwoNumbers(int a, int b){
            try{
                System.out.println(a/b);
            }
            catch(ArithmeticException e){
                System.out.println("Syntax Error");
            }
        }
        public static void giveMeValue(int a, int b){
            int[][] array=new int[5][10];
            try{
                System.out.println(array[a][b]);
            }
            catch (IndexOutOfBoundsException e){
                System.out.println("invalid index number");
            }
        }

    }
