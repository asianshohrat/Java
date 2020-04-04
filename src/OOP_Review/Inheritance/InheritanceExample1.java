package OOP_Review.Inheritance;

public class InheritanceExample1 {
    private static int additionPrivateStatic(int a, int b){
        return a+b;
    }
    {
        InheritanceExample1.additionPrivateStatic(4,7);
    }
    public static int additionPublicStatic(int a,int b){
        return a+b;
    }
    private int additionPrivate(int a,int b){
        return a+b;
    }
    {
        this.additionPrivate(8,7);
    }
    public int additionPublic(int a,int b){
        return a+b;
    }

}

