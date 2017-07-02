import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by vaisakh on 02/07/17.
 */
public class GroupAnagrams {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        int i, c = 0;
        int totalcount =0;


        while (tc>0) {

            int arraysize = sc.nextInt();
            String a[] = new String[arraysize];

            for (int j = 0; j < arraysize; j++) {

                a[j] = sc.next();

            }

            for (i=0; i<arraysize; i++){
                for(int j=0; j<arraysize; j++){

                    c = anagrams(i,j,a);
                }

                totalcount = totalcount + c;

            }
            System.out.print(totalcount);
            totalcount =0;
            tc --;
        }
    }

    static int anagrams(int a, int b, String A[])
    {
        int count = 0;
        char A1[] = A[a].toLowerCase().toCharArray();
        char B1[] = A[b].toLowerCase().toCharArray();

        Arrays.sort(A1);
        Arrays.sort(B1);

        if (Arrays.equals(A1,B1)){
            count = count + 1;

        }
        return count;
    }
}
