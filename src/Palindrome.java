import java.util.Scanner;

/**
 * Created by vaisakh on 04/07/17.
 */
public class Palindrome {

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        char a[] = text.toLowerCase().toCharArray();
        int n = a.length;

        StringBuilder str = new StringBuilder();

        for(int i=n-1; i>=0; i--)
        {
            str.append(a[i]);
        }

        String rev = str.toString();

        if(text.compareTo(rev) == 0)
        {
            System.out.print("Palindrome");
        }

        else
        {
            System.out.print("Not Palindrome");
        }

    }
}
