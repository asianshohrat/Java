package firstproject;

public class Kahoot {
    public static void main(String[] args) {
        int a;
        int b=5;
        int c=0;
        for (a=b++; a!=b; ++a){
            System.out.println(a+" "+b);
            ++b;
            if (a>b){
                a=0;
                b=1;
            }
        }

    }
}
