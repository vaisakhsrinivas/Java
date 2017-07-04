import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by vaisakh on 04/07/17.
 */
public class HMCount {

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.next();
        int count;
        int countchar;

        char A[] = s1.toLowerCase().toCharArray();
        String S[] = s.split(" ");
        //int n = A.length;

        HashMap<String,Integer> hm =  new HashMap<String,Integer>();

        HashMap<Character,Integer> hc = new HashMap<Character, Integer>();

        for(int i=0; i<S.length; i++){
            if(hm.containsKey(S[i]))
            {
                count = hm.get(S[i]);
                hm.put(S[i], count+1);
            }

            else
            {

                hm.put(S[i],1);
            }
        }

        System.out.print(hm);


        for(int i=0; i<A.length; i++)
        {
            if(hc.containsKey(A[i]))
            {

                countchar = hc.get(A[i]);
                hc.put(A[i], countchar+1);
            }

            else
            {
                hc.put(A[i],1);
            }
        }

        System.out.print(hc);
    }
}
