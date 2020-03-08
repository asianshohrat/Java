package review;

public class RemoneAllSpace {
    public static void main(String[] args) {

        spaceRemove("Saturday and Sunday is a perfect day to study Java");

    }
    public static void spaceRemove(String text){
        String result = "";
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) != ' '){
                result += text.charAt(i);

            }
        }String print = result.toUpperCase();
        System.out.println(print);
    }


}
