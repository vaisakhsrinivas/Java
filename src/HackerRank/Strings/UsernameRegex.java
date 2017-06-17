package HackerRank.Strings;

/**
 * Created by vaisakh on 17/06/17.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UsernameRegex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String username = in.nextLine();
            String pattern = "^[a-zA-Z][\\w]{7,29}$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(username);

            if (m.find( )) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}
