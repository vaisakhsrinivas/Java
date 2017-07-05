import java.util.Scanner;

/**
 * Created by vaisakh on 04/07/17.
 */
public class Fibinocci {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(fib (n));

    }

    static int fib (int a)
    {
        if (a == 0)
        {
            return 0;
        }

        else if( a==1)
        {
            return 1;
        }

        else
        {
           return fib(a-1)+fib(a-2);
        }
    }

}
