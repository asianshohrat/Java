package methods;

public class CharRemoving {
    public static void removeChar(String text,char letter) {
        for (int i=0; i<text.length();i++){
            if (text.charAt(i)!=letter){
                System.out.println(text.charAt(i));
            }
        }

    }

    public static String removeCharStr(String text,char letter) {
   String remove = "";
        for (int i = 0; i < text.length(); i++) {
        if (text.charAt(i) != letter) {
            remove += text.charAt(i);
        }
    }
        return remove;
}

   }

