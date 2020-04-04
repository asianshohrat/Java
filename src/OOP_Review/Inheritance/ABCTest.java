package OOP_Review.Inheritance;

public class ABCTest {
    public static void main(String[] args) {
        A ob1 = new A(10);
        System.out.println(ob1.getA());
        B obj2 = new B(2);
        System.out.println(obj2.getA());
        C obj3 = new C(5);
        System.out.println(obj3.getA());
        obj3.setA(40);
      ob1.setA(88);
        System.out.println(ob1.getA());
        System.out.println(obj2.getA());
        System.out.println(obj3.getA());
    }

}
