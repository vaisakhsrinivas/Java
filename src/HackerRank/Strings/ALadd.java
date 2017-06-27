package HackerRank.Strings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by vaisakh on 27/06/17.
 */
public class ALadd {

    public static void main (String[] args){

        String str;
        int size, queries;

        ArrayList<Integer> al = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        size = sc.nextInt();

        for (int i=0; i<size; i++){
            al.add(sc.nextInt());
        }


        System.out.println("Enter number of Queries");
        queries = sc.nextInt();

        for (int j=0; j<queries; j++){


            System.out.println("Enter your option");
            String method = sc.next();

            if (method.equalsIgnoreCase("Insert")){

                int index = sc.nextInt();
                int element = sc.nextInt();
                al.add(index,element);
            }

            else if(method.equalsIgnoreCase("Delete")){

                int delete = sc.nextInt();
                al.remove(delete);
            }
        }

        Iterator itr = al.iterator();
        while(itr.hasNext()){

            System.out.println(itr.next());
        }
    }
}
