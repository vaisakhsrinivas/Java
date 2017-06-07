package HackerRank.Strings;

import java.util.Scanner;

/**
 * Created by vaisakh on 06/06/17.
 */
public class StringPalindrome {

    public static void main(String args[])
    {
        String s;
        String srev;
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        srev = new StringBuffer(s).reverse().toString();

        if(s.equals(srev))
        {
            System.out.println("String is Palindrome");
        }

        else
        {
            System.out.println("String is not Palindrome");
        }

    }
}
