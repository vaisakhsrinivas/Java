package HackerRank.Strings;

import java.util.Scanner;

/**
 * Created by vaisakh on 06/06/17.
 */
public class StringsIntro {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int totallength = a.length() + b.length();

        System.out.println(totallength);

        String aupper = Character.toUpperCase(a.charAt(0))+a.substring(1);
        String bupper = Character.toUpperCase(b.charAt(0))+b.substring(1);

        System.out.println(aupper);
        System.out.println(bupper);

        int compare = a.compareTo(b);

        if (compare < 0)
        {
            System.out.println ("String A comes before B");
        }

        else if (compare >= 0)
        {
            System.out.println ("String B comes before A");
        }

    }
}
