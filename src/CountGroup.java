import java.util.Scanner;

/**
 * Created by vaisakh on 01/07/17.
 */
public class CountGroup {

    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        int count = 0;
        int i;


        while (tc>0){

            int arraysize = sc.nextInt();
            int a[] = new int [arraysize];

            for(int j =0; j<arraysize; j++){

                a[j] = sc.nextInt();

            }

            for(int k =0; k<arraysize-1; k++){

                for(int l=k+1; l<arraysize; l++)
                {
                    if ((a[k]+a[l]) % 3 == 0){
                        count++;
                    }
                }
            }

            for( i=0; i<arraysize-2; i++){

                for(int j=i+1; j<arraysize-1; j++)
                {
                    for(int k = j+1; k<arraysize; k++){
                        if ((a[i]+a[j]+a[k])%3 == 0)
                        {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
            tc--;
            count = 0;
        }

    }
}
