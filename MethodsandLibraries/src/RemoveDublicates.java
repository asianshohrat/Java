public class RemoveDublicates {
    public static void main(String[] args) {
        removeChar("aaabbbcc" );
       // System.out.println( removeChar("baaabbbcc" ));


    }
    public static  void removeChar(String word ){
        char L = word.charAt(0);
        String output = Character.toString(L);
        for( int i=1; i<word.length();i++){
            if(word.charAt(i)!=word.charAt(i-1)){
                output+=word.charAt(i);
            }
        }
        System.out.println(output);
    }
}
