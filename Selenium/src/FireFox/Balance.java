package FireFox;

import java.util.*;
import java.util.regex.*;


// Write your code here. DO NOT use an access modifier in your class declaration.
class Parser{
    boolean isBalanced(String ex)
    {
        Deque<Character> stack = new ArrayDeque<Character>();

        for (int i=0; i <ex.length(); i++){

            char x = ex.charAt(i);

            if (x == '(' || x == '{')
            {
                stack.push(x);
                continue;
            }

            if (stack.isEmpty())
                return false;

            char c;

            switch (x) {

                case ')':

                    c = stack.pop();
                    if (c == '{')
                        return false;
                    break;

                case '}':

                    c = stack.pop();
                    if (c == '(')
                        return false;
                    break;


            }
        }

        return (stack.isEmpty());
    }
}

class Balance {

    public static void main(String[] args) {
        Parser parser = new Parser();

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            System.out.println(parser.isBalanced(in.next()));
        }

        in.close();
    }
}
