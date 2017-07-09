package HackerRank.Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SuperReducedString {

    static String super_reduced_string(String s) {

        int count;

        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        char c[] = s.toLowerCase().toCharArray();
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < c.length; i++) {

            if (!hm.containsKey(c[i])) {
                hm.put(c[i], 1);
            } else {
                count = hm.get(c[i]);
                hm.put(c[i], count + 1);
            }

        }

        for(Map.Entry<Character,Integer> entry : hm.entrySet())
                if (entry.getValue()%2 != 0)
                {
                    buffer.append(entry.getKey());
                }

                if (buffer.length() == 0)
                {
                    return "Empty String";
                }

        return buffer.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        //String s = "aaabccddd";
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
