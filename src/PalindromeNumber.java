import java.util.Scanner;

/**
 * Created by vaisakh on 04/07/17.
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=0;
        int t = n;

        while (n>0){

            int r = n%10;
            s = (s*10)+r;
            n = n/10;

        }

        if (t==s)
        {
            System.out.print("Number is Palindrome");
        }

        else
        {
            System.out.print("not palindome");
        }




    }

}

