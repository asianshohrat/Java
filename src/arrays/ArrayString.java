package arrays;

public class ArrayString {
    public static void main(String[] args) {
        String[] n = {"asd", "asfdgvb", "asdc", "saa"};
        int count = 0;

        for (int i=0; i<n.length;i++) {
            if (n[i].length() <=3) {
                System.out.println(n[i]);
                count++;
            }
        }

        System.out.println("Total Numbers of less than 4 character : "+count);
    }
}
