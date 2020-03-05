package arrays;

public class TwoDimArray10x10 {
    public static void main(String[] args) {


        int n = 10;

        int[][] x = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                x[i][j] = (int) ((Math.random() * 100) + 1);
                System.out.format("%5d", x[i][j]);
            }
            System.out.println();
        }

    }
}
