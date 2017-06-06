package HackerRank.Strings;

import java.util.Scanner;
/**
 * Created by vaisakh on 06/06/17.
 */
public class SubString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        for (int i = start; i < end; i++) {
            System.out.print( S.charAt(i));
        }
    }
}