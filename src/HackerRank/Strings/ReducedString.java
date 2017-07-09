package HackerRank.Strings;

import java.util.Scanner;

/**
 * Created by vaisakh on 09/07/17.
 */
public class ReducedString {

    static String super_reduced_string(String s) {

        StringBuffer buffer = new StringBuffer(s);

        for (int i = 1; i < buffer.length(); i++) {
        if (buffer.charAt(i) == buffer.charAt(i - 1)) {
            buffer.delete(i-1, i+1);
            i = 0;
        }
    }

        if (s.length() == 0) {
        return "Empty String";
    } else {
        return buffer.toString();
    }
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        //String s = "aaabccddd";
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
