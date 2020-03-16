package creating_classes;
public class StringOperationsTest {
    public static void main(String[] args) {
        StringOperations myStr = new StringOperations("java is super fun");
        System.out.println(myStr.returnReversed());
        System.out.println(myStr.returnCapitalized());
    }
}