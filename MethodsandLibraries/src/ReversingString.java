import com.sun.jdi.PathSearchingVirtualMachine;

public class ReversingString {

    public static void main(String[] args) {
       // Reversing.reversingString( sentence)
        mirror("I love Java");
        //String reversed=Reversing.RVSTEXT("hello world");
        System.out.println();
        System.out.println(RVSTEXT("hello world"));

       // Reversing.sayPalindrome("madam");
    }

    public static void mirror( String Text) {

        for (int i = Text.length(); i > 0; i--){
            System.out.print(Text.charAt(i -1));
        }

        }

    public static String RVSTEXT(String text) {
        String result="";
        for (int i= text.length()-1; i>=0; i--){
            result=result+text.charAt(i);
        }
        return result;
    }
    public static void sayPalindrome(String word){
       // String reverseWord=reverseText(Word);
      //  if (reverseWord.equals(Word)) {
            System.out.println("Palindrome");
        }
    //    else{
    //        System.out.println("Not Palindrome");
     //   }
  //  }
}

