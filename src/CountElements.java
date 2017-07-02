import java.util.Scanner;

/**
 * Created by vaisakh on 01/07/17.
 */
public class CountElements {
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        int count = 0;
        int i, j;


        while (tc>0){

            int arraysize = sc.nextInt();
            int a[] = new int [arraysize];
            int b[] = new int[arraysize];

            for(i =0; i<arraysize; i++){

                a[i] = sc.nextInt();

            }
            
            for(j=0; j<arraysize; j++){
                b[j] = sc.nextInt();
            }

            for (i=0; i< arraysize; i++)
            {
                for(j=0; j<arraysize; j++){

                    if (a[i] >= b[j])
                    {
                        count = count+1;
                    }

                    else
                    {
                        count = count+0;
                    }

                }
                System.out.print(count + ",");
                count = 0;
            }

            tc--;

        }
                
    }
}
