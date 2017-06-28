package HackerRank.Strings;
import java.util.*;
import java.io.*;

/**
 * Created by vaisakh on 27/06/17.
 */
public class JavaStack {

    public static void main(String args[]) {

        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();

            System.out.println(balanced(input,map) ? "true":"false");

        }
    }


    private static boolean balanced(String input, HashMap<Character, Character> map)
    {
        if ((input.length() % 2) !=0){
            return false;
        }

        ArrayDeque<Character> al = new ArrayDeque<>();
        for(int i=0; i<input.length(); i++)
        {
            Character ch = input.charAt(i);

            if(map.containsKey(ch)){
                al.push(ch);
            } else if (al.isEmpty() || ch != map.get(al.pop())){
                return false;
            }
        }
        return al.isEmpty();
    }
}
