package OOP_Review.Polymorphisim;

public class ShapeCalcTest {
    public static void main(String[] args) {
        ShapeCalc.calculatePerimeter(10);
        ShapeCalc.calculatePerimeter(10.0);
        ShapeCalc.calculatePerimeter(10,10,10);
        ShapeCalc myShp = new ShapeCalc();
        myShp.calculateArea(10);
        myShp.calculateArea(10,20);
        myShp.calculateArea(10.0);
    }

}
