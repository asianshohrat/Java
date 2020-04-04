package OOP_Review.Polymorphisim;

public class Squares implements Polygons {
    public void calculatePerimeter(int edge){
        System.out.println("Perimeter of Square : "+(4*edge));
    }
}
