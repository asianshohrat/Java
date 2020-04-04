package OOP_Review.Inheritance;

public class OpsTest {
    public static void main(String[] args) {
        Operations parent= new Operations();
        parent.add(2,3);
    AdvancedOps child = new AdvancedOps();
    child.sumProduct(2,3,4);
    parent.multiply(4,5);
    child.multiply(7,8);
    }

}
