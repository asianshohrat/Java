public class OddNumbers {
    public static void oddnumber(int a, int b){
        for (int i=a;i<=b;i++) {
            if (i%2 !=0){
                System.out.print(i+"\t");
            }
        }
    }
    public static void evennumbers(int c, int d){
        for (int i=c;i<=d;i++) {
            if (i%2 ==0){
                System.out.print(i+"\t");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("ODD NUMBERS");
        oddnumber(4,9);
        System.out.println();
        System.out.println("Even Numbers");
        evennumbers(4,9);
    }
}
