import java.util.Scanner;

/**
 * Created by vaisakh on 03/07/17.
 */
public class UnsortedArray {

    public static void main(String[] args)
    {
        int t, t1;
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc >0){

            int arraysize = sc.nextInt();
            int[] a = new int [arraysize];

            for(int i=0; i<arraysize; i++)
            {
                a[i] = sc.nextInt();
            }

            int mid = a.length/2;

            int temp = a[mid];


            for(int i=0; i<mid; i++){
                if(a[i] > temp)
                {
                    t = a[i];
                    a[i] =  temp;
                    temp = t;
                }
            }

            for(int i=mid+1; i<a.length; i++)
            {
                if (a[i] < temp)
                {
                    t1 = a[i];
                    a[i] = temp;
                    temp = t1;
                }
            }

            System.out.print(temp);

            tc--;
        }
    }
}
