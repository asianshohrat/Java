package firstproject;

public class VowelsOnlyWhile {
    public static void main(String[] args) {

        String myStr = "Sunday is fun day";
        int index = 0;
        while (index < myStr.length()) {
            if (!(myStr.charAt(index) == 'u' || myStr.charAt(index) == 'a' || myStr.charAt(index) == 'i'||myStr.charAt(index) == ' ')) {
                System.out.println(myStr.charAt(index) + "\t index value is :" + index);
            }
            index++;


        }
    }
}
