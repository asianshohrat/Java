package arrays;

public class ArraySym {

    public static void main(String[] args) {
        int nArray[] = {99, 745, 2, 2, 745, 99};
        SymArray(nArray);
    }

    public static void SymArray(int nArray[]) {
        boolean b = true;
        for (int i = 1; i < nArray.length; i++) {
            if (nArray[i] != nArray[nArray.length - 1-i ]) {
                b = false;
            }
        }
        if (b) {
            System.out.println("Symmetric Array");
        } else {
            System.out.println("NOT symmetric Array");


        }
    }


}
