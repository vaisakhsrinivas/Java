import java.util.Scanner;

/**
 * Created by vaisakh on 03/07/17.
 */
public class CheckBits {

    public static void main(String args[])

    {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc >0){
            int n = sc.nextInt();

            if (n==0 )
            {
                System.out.print("No");
            }

            if (((n+1) & n)==0)
            {
                System.out.print("Yes");
            }

            else
            {
                System.out.print("No");
            }

            tc--;
        }

    }
}
