package WriteToFile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by vaisakh on 08/06/17.
 */
public class Append {



    public static void main (String[] args) throws IOException
    {
        String filename = "grades.txt";
        Scanner sc = new Scanner(new FileReader(filename));
       int grade;
       append();
        while (sc.hasNextLine()) {
            grade = Integer.parseInt(sc.nextLine());
            System.out.println(grade);
        }

    }

    public static void append() throws IOException{
        String filename = "grades.txt";
        PrintWriter pw = new PrintWriter(new FileWriter(filename, true));
        Scanner sc = new Scanner(System.in);
        int grade = 0;
        System.out.println("Enter the grade");
        grade = sc.nextInt();
        while(grade !=-1)
        {
            pw.println(grade);
            System.out.println("Enter -1 to quit");
            grade = sc.nextInt();

        }

        sc.close();
    }
}
