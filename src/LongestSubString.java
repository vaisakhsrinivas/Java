import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by vaisakh on 05/07/17.
 */
public class LongestSubString {

    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        int longeststringlength = 0;
        String longeststring = null;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(!hm.containsKey(c))
            {
                hm.put(c,i);
            }

            else
            {
                i = hm.get(c);
                hm.clear();

            }

            if(hm.size() > longeststringlength)
            {
                longeststringlength = hm.size();
                longeststring = hm.keySet().toString();
            }
        }

        System.out.print(longeststringlength);
        System.out.println(longeststring);
    }
}
