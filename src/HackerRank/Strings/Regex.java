package HackerRank.Strings;

/**
 * Created by vaisakh on 15/06/17.
 */
import java.util.Scanner;
import java.util.regex.*;

public class Regex
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
            testCases--;

        }
    }
}

