package methods;

public class GivenIndexReturn {
    public static void main(String[] args) {
        //first way
        System.out.println(givenindexreturn("Hello",1,3));
        // second way


    }
    //first way

        public static String givenindexreturn(String word, int a, int b){
        String output = "";

        for (int i = a ; i<= b ; i++){
            output += word.charAt(i);
        }

        return output;
    }

    // second way

}
