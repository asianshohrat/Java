public class MultiplactionTable {

    public static void multiplicationtable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print( (i * j)+"\t");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       multiplicationtable();
    }
}
