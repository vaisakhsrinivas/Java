package HackerRank.Strings;
import java.io.*;
import java.util.*;

/**
 * Created by vaisakh on 15/06/17.
 */
public class StringTokens {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            if(!scan.hasNext()) {
                System.out.println(0);
                return;
            }
            String s = scan.nextLine();
            String[] s1 = s.trim().split("[ !,?._'@]+");
            System.out.println(s1.length);
            for(String s2:s1){
                System.out.println(s2);
            }
            scan.close();
        }
    }
