package firstproject;

public class HexJavaisFun {
    public static void main(String[] args) {

        String myStr = "Java is fun";
        for (int index=0; index<myStr.length();index++){
            if(myStr.charAt(index)=='a'||myStr.charAt(index)=='i'||myStr.charAt(index)=='u'){
                System.out.println(myStr.charAt(index)+"\t index value is :"+index);
            }
        }
        System.out.println();


        int index2 = 0;
        while (index2 < myStr.length()) {
            if (myStr.charAt(index2) == 'a' || myStr.charAt(index2) == 'i' || myStr.charAt(index2) == 'u') {
                System.out.println(myStr.charAt(index2) + "\t index value is :" + index2);
            }
            index2++;


        }

    }}