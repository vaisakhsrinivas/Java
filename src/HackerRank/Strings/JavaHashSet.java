package HackerRank.Strings;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by vaisakh on 28/06/17.
 */
public class JavaHashSet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        HashSet<String> set = new HashSet<String>();
        int count = 0;
        for (int j = 0; j < t; j++) {
            set.add(pair_left[j] + " " + pair_right[j]);
            System.out.println(set.size());
        }
    }
}
