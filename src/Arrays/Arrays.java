package Arrays;

import java.util.Random;

/**
 * Created by vaisakh on 06/06/17.
 */
public class Arrays {

    public static void main(String[] args)
    {
        final int size = 100;
        int[] num = new int [size];

        buildarray(num,size);
        displayarray(num,size);
    }

    static void buildarray(int[] arr, int size)
    {
        Random rand = new Random();
        for(int i =0; i<size; i++){
            arr[i] = rand.nextInt(101);
        }
    }

    static void displayarray(int[] arr, int size)
    {
        for(int i =0; i<size; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
