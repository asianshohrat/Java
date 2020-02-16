// nested loop for number and letter printing as requested
package firstproject;

public class NestedLoopQuestion
{
    public static void main(String[] args) {
char character='a';

        for (int i=1; i<=5; i++){
            System.out.print(i+"\t");
            for (int j=1; j<=4; j++){
                System.out.print(character+"\t");
                character++;
            }
            System.out.println();
        }
    }
}
