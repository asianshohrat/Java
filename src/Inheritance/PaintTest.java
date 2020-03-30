package Inheritance;

public class PaintTest {
    private static Object CalculatePrice;

    public static void main(String[] args) {
            Paint myPaint = new Paint("zero gravity",2800);
            System.out.println(myPaint.toString());
            System.out.println(myPaint.CalculatePrice());
            CustomPaint myCustomPaint = new CustomPaint("moon blue",3200,"durable","extra glossy");
            System.out.println(myCustomPaint.calculateCustomPrice());
        }
}
