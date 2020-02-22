package firstproject;

public class SandClock1to7 {
    public static void main(String[] args) {
        for(int m=1; m<=10; m++) {

            for (int n = 1; n <= m; n++) {

                System.out.print("  ");

            }
            //System.out.print("---");
            for (int o = m; o <= (10 ); o++) {

                System.out.print(o+"   ");

            }
            for (int p = 1; p <= (m); p++) {

                System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=1; i<=10; i++) {

            for (int j = 10; j >= i; j--) {

                System.out.print("  ");

            }
           // System.out.print("---");
            for (int k =i; k <= 10; k++) {

                System.out.print(k+"   ");

            }
            for (int l = 10; l >= i; l--) {

                System.out.print("  ");
            }
            System.out.println();
        }
    }
}


