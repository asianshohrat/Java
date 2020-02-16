package firstproject;

public class WhileWhileQuestion {
    public static void main(String[] args) {
        int j=97;
        for (int i=1;i<6;i++){
            int k=1;
            System.out.print(i+" ");
            while(k<5){
                System.out.format("%c ",j);
                k++;
                j++;
            }
            System.out.println();
        }
    }
}
