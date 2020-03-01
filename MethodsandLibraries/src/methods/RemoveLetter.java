package methods;

public class RemoveLetter {
    public static void main(String[] args) {
        removeChar("Hello Boot Campers",'e' );
        System.out.println(removeChar("Hello"));

        removeChar("Hello",'e');
    }
    public static void  removeChar(String word,char letter ){
        String output="";
        for( int i=0; i<word.length();i++){
            if(word.charAt(i)!=letter){
                output+=word.charAt(i);
            }
        }
        System.out.println(output);
    }

    public static String removeChar(String input){
        String removed="";
        int next=1;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)!=input.charAt(next)){
                removed+=input.charAt(i);
            }
            if(next<input.length()-1){
                next++;
            }
        }
        removed+=input.charAt(input.length()-1);
        return removed;
    }


    public static void removeChar3(String a, char b){
        char c;
        String d="";
        for (int i=0;i<a.length();i++){
            c = a.charAt(i);
            if (c!=b){
                d=d+a.charAt(i);
            }
        }
        System.out.println(d);
    }
}
