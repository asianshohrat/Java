public class PrintName {
    public static void main(String[] args) {
        System.out.println("Sunday is Fund day with Java");
        printMyname();
        printMyname2("it is always fun with Java");
        System.out.println(printMyname3());
        System.out.println(printMyname4("So you are also in love with Java"));


    }

    public static void printMyname() {
        System.out.println("Yes Sure");
    }

    public static void printMyname2(String name) {
        System.out.println(name);
    }

    public static String printMyname3() {
        return " o yeah i love Java too";
    }

    public static String printMyname4(String name) {
        return name;

    }
    }


