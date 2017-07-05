import java.util.Scanner;

public class SubSequence {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String s1= "hackerrank";

            if(s.length() < s1.length())
            {
                System.out.println("NO");
            }

            int j =0;
            for(int i=0; i< s.length(); i++)
            {
                if (j<s1.length() && s.charAt(i) == s1.charAt(j))
                {
                    j++;
                }
            }

            if( j==s1.length())
            {
                System.out.println("YES");
            }
        }
    }
}

