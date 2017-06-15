package HackerRank.Strings;
import java.io.*;
import java.util.*;

/**
 * Created by vaisakh on 15/06/17.
 */
public class Anagrams {

    static boolean isAnagram(String a, String b) {
        char A[] = a.toLowerCase().toCharArray();
        char B[] = b.toLowerCase().toCharArray();
        Arrays.sort(A);
        Arrays.sort(B);
        return Arrays.equals(A, B);

    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
