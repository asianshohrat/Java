package review;

public class MethodsAdd2Int {
    public static void main(String[] args) {
       int result=add2int(5,6);
        System.out.println(result);

        double resultdouble=add2double(2.3,5.8);
        System.out.println(resultdouble);

        char addchar=add2char('a','a');

        System.out.println(addchar);


        String addstring= add2String("asas", "asfsdf");
        System.out.println(addstring);


    }
    public static int add2int (int n , int m){
        int total = n + m;
        return total;
    }

    public static double add2double (double n , double m){
        double total = n + m;
        return total;
    }

    public static char add2char (char n , char m){
        char total =  (char)((int)n + (int)m );
        return total;
    }

    public static String add2String (String n , String m){
        String total =""+  n + m;
        return total;
    }

}
