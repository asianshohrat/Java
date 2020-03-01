package methods;

public class NumberAlphabetWhile2 {

    public static void printNumsLetters() {
        int numbers=1;
        int count;
        char letter='a';

        while(numbers<6){
            System.out.print(numbers+"\t");
            count=0;
            while(count<4){

                System.out.print(letter+"\t");
                count++;
                letter++;
            }
            System.out.println();
            numbers++;
        }
    }
}


