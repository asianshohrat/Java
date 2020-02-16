package firstproject;

public class LowerCaseOnly {
    public static void main(String[] args) {
        String myStr = "I never Forget to push my Codes to GitHub";
        char letter;
        for (int i=0; i<myStr.length(); i++){
            letter=myStr.charAt(i);
            if(letter>=97 && letter<=122){
                System.out.println(myStr.charAt(i));
            }

        }
    }
}
