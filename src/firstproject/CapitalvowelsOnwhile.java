package firstproject;

public class CapitalvowelsOnwhile {
    public static void main(String[] args) {
        String myStr = "Boot Campers Are Best Students For Ever";
       char letter;
        for (int i=0; i<myStr.length(); i++){
            letter=myStr.charAt(i);
            if(letter>=65 && letter<=90){
                System.out.println(myStr.charAt(i));
            }

        }



//        int index = 0;
//        letter=0;
//        while (index < myStr.length()) {
//
//             if(letter>=65 && letter<=90){
//                System.out.println(myStr.charAt(index));
//            }
//            }
//            index++;



    }
}
