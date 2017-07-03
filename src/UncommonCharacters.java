import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by vaisakh on 03/07/17.
 */
public class UncommonCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        int count1 = 0;
        int count2=0;

        while (tc > 0) {

            String s1 = sc.next();
            String s2 = sc.next();

            for(int i=97;i<=122;i++)
            {
                for(int j=0;j<s1.length();j++)
                {if(s1.charAt(j)==(char)i)
                    count1++;}
                for(int k=0;k<s2.length();k++)
                {if(s2.charAt(k)==(char)i)
                    count2++;}
                if((count1>0)&&(count2==0))
                    System.out.print((char)i);
                if((count2>0)&&(count1==0))
                    System.out.print((char)i);

                count1=0;
                count2=0;
            }

            tc--;
            System.out.println();

            //if (count ==0)

        }
    }
}