package methods;

public class PalindromeVoid {
    public static void palindromeCheck(String text){
        String reversed="";
        for (int i=text.length()-1; i>=0; i--){
            reversed+=text.charAt(i);
        }
if (reversed.equals(text)){
    System.out.println("Palindrome");
}
    else{
    System.out.println("NOT Palindrome");
    }
    }
}
