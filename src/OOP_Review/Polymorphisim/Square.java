package OOP_Review.Polymorphisim;

public class Square extends Polygon {
    public void calculatePerimeter(int edge){
        System.out.println("Perimeter of the Square : "+(4*edge));
    }
}
