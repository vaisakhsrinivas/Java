package HackerRank.Strings;

import java.util.Scanner;

/**
 * Created by vaisakh on 06/06/17.
 */
public class StringCompare {

    public static void main (String[] args){

        String sub;
        String submin, submax;
        Scanner input = new Scanner(System.in);
        String s =  input.next();
        Integer n = input.nextInt();
        submin = s.substring(0,n);
        submax = s.substring(0,n);

        for (int i=0; i+n<=s.length(); i++)
        {

            if(s.substring(i,i+n).compareTo(submin)<0)
            {
                    submin = s.substring(i,i+n);
            }

            else if (s.substring(i,i+n).compareTo(submax)>0)
            {
                    submax = s.substring(i, i+n);
            }
        }

        System.out.println(submin);
        System.out.println(submax);

    }
}
