package HackerRank.Strings;
import java.util.*;
import java.io.*;
/**
 * Created by vaisakh on 27/06/17.
 */

public class HM{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        String name;
        int phone;
        String s="";
        int n=in.nextInt();
        in.nextLine();
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        for(int i=0;i<n;i++)
        {
            name=in.nextLine();
            phone=in.nextInt();
            in.nextLine();
            hm.put(name,phone);
        }
        while(in.hasNext())
        {
            s=in.nextLine();
            if(hm.get(s)!= null){
                int p=hm.get(s);
                System.out.println(s+"="+p) ;
            }
            else{
                System.out.println("Not found") ;
            }
        }

    }
}

