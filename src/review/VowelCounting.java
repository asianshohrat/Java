package review;

public class VowelCounting {
    public static void main(String[] args) {
        String sentence = "We are in love with Java";
        int counter=0;
        sentence = sentence.toLowerCase();
        for(int i=0 ;i<sentence.length();i++){
            char word = sentence.charAt(i);
            boolean check = word=='a'|| word=='e'|| word=='i'|| word=='o'|| word=='u';
            if(check){
                counter++;
            }
        }
        System.out.println("Total : "+ counter+" vowels");
    }
}

