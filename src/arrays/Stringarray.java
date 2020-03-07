package arrays;

public class Stringarray {
    public static void main(String[] args) {
        System.out.println(array());
    }
    public static String[][] array(){
        String[][] x=new String[5][5];
        int a=0;
        for (int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                x[i][j]=chars(a);
                a++;
            }
        }
        return x;
    }
    public static String chars(int a){
        String b="";
        b = ""+(char)(65+a);
        return b;
    }
   // public static printArray()
}
