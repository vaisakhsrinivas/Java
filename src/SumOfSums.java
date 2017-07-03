import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by vaisakh on 02/07/17.
 */
public class SumOfSums {

   static class p {
        int x, y;

        p(int x1, int y1) {
            x = x1;
            y = y1;
        }
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        int i;


        while (tc > 0) {

            int arraysize = sc.nextInt();
            int a[] = new int[arraysize];

            for (int j = 0; j < arraysize; j++) {

                a[j] = sc.nextInt();

            }

            HashMap<Integer, p> map = new HashMap<Integer, p>();

            for (i = 0; i < arraysize; i++) {
                for (int j = 1; j < arraysize; j++) {
                    int sum = a[i] + a[j];

                    if (!map.containsKey(sum)) {
                        map.put(sum, new p(i, j));
                    } else {

                        p p1 = map.get(sum);

                    }
                }
                System.out.print("True");
            }
            System.out.print("False");

        }
    }
}
