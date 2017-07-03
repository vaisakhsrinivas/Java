import java.util.Scanner;

/**
 * Created by vaisakh on 03/07/17.
 */
public class UncommonChars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        int count1 = 0;
        int count2 = 0;

        while (tc > 0) {
            String s1 = sc.next();
            String s2 = sc.next();

            int n1 = s1.length();
            int n2 = s2.length();
            int[] arr = new int[128];

            for (int i = 0; i < n1; i++) {
                if(arr[s1.charAt(i)] == 0){
                    arr[s1.charAt(i)]++;
                }
            }

            for (int j = 0; j < n2; j++) {
                arr[s2.charAt(j)]++;
            }

            for(int i=97; i<=122; i++){
                if(arr[i] == 1){
                    System.out.print((char)i);
                }
            }
        }
    }
}
