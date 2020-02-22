package firstproject;

public class GradesSwitch {
    public static void main(String[] args) {
        int grade=79;

                switch((int)grade/10){
                    case 10:
                    case 9:
                        System.out.println("A");
                    case 8:
                    case 7:
                        System.out.println("B");
                    case 6:
                        System.out.println("c");
                    case 5:
                        System.out.println("F");
                }
    }
}
