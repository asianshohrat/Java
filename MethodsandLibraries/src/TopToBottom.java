

public class TopToBottom {
    public static void main(String[] args) {
printVertical("Hello");
    }

    public static void printVertical(String text) {
        for (int i=0; i<text.length(); i++){
            System.out.println(text.charAt(i));
        }

    }
}
