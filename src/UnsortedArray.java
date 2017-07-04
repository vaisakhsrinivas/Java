import java.util.Scanner;

/**
 * Created by vaisakh on 03/07/17.
 */
public class UnsortedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc >0){

            int n = sc.nextInt();
            int[] arr = new int [n];

            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }

            for(int i=1; i<n-1; i++){
                if(arr[i]>=arr[i-1] && arr[i]<=arr[i+1]){
                    boolean left = true;
                    for(int j=i-2; j>=0; j--){
                        if(arr[i]<arr[j]){
                            left=false;
                        }
                    }
                    boolean right = true;
                    if(left){
                        for(int k=i+2; k<n; k++){
                            if(arr[i]>arr[k]){
                                right = false;
                            }
                        }
                    }
                    if(left && right){
                        System.out.println(arr[i]);
                        break;
                    }
                }
            }
            System.out.print(-1);
            tc--;
        }
    }
}
