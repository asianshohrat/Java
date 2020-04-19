package Collections.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class DuplucateRemoving {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random rnd = new Random();
        Collections.sort(arr);
        for (int i = 1; i <= 10; i++) {
            arr.add(rnd.nextInt(100));
        }
        for (int i = 0; i < 9; i++) {
            if (arr.get(i) == arr.get(i + 1)) {
                arr.remove(i + 1);
            }
        }
        System.out.println(arr);
    }
}
