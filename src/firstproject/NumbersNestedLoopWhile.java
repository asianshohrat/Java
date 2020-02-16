package firstproject;

public class NumbersNestedLoopWhile {
    public static void main(String[] args) {
        int i=1;
        while(i<10){
            int j=0;
            while (j<=9){
                System.out.println(i+""+j);
                j++;
            }
            i++;
        }
    }
}
