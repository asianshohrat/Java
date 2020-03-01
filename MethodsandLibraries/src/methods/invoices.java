package methods;

public class invoices {

    public static void main(String[] args) {
        String Asnwer = Bill(4000);
        System.out.println(Asnwer);
        String Desigion = eveluateInternet(100);
        System.out.println(Desigion);


    }

    public static String Bill(int C) {
        String result = "";
        if (C >= 500 & C < 1000) {
            result = " Good Job";
        } else if (C >= 1000 & C < 1500) {
            result = "not bad";
        } else if (C > 1500) {
            result = "Start save energy";
        } else
            result = "Wrong";
        return result;
    }

    public static String eveluateInternet(int speed) {
        String conculusion;

        if (speed > 300) {
            conculusion = "Super Speed";
        } else if (speed > 100) {
            conculusion = "Good Speed";
        } else {
            conculusion = "Unknown Speed";
        }
        return conculusion;
    }
}

