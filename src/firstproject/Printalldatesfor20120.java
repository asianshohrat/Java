package firstproject;

public class Printalldatesfor20120 {
    public static void main(String[] args) {
int mf=1,df=1,yf=2020;

        // with for loop
        for (mf=1; mf<=12;mf++) {
            for (df = 1; df <= 30; df++) {
                System.out.println(mf + "/" + df + "/" + yf);

            }System.out.println("__________");
        }
        // while version
        System.out.println("while version");
        int m=1;

        int y=2020;
        while (m<=12){
            int d=1;
            while(d<=30) {
                System.out.println(m + "/" + d + "/" + y);
                d++;
            }System.out.println("__________");
            m++;

            }

// dowhile version
        System.out.println("dowhile version");

        int yd=2020;
        int md=0;

        do{
            int dd=0;
            md++;

            do {

                dd++;
                System.out.println(md + "/" + dd + "/" + yd);
            }while (dd<30);
        System.out.println("__________");

        } while (md<12 );
        // While and for
        System.out.println("While and for version");
        int mwf=1;
        while (mwf<=12){
            for (int dwf=1; dwf<=30 ; dwf++){
                System.out.println(mwf + "/" +dwf+"/"+y);
            }
            mwf++;
        }
//for and while

        System.out.println("for and while version");

        int dfw;
        for (int mfw=1; mfw<=12; mfw++){
            dfw=1;
            while (dfw<=30){
                System.out.println(mfw+"/"+dfw+"/"+y);
                dfw++;
            }
        }


    }
}


