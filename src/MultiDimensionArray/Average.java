package MultiDimensionArray;

import java.util.Random;

/**
 * Created by vaisakh on 06/06/17.
 */
public class Average {

    public static void main(String[] args)
    {
        final int rsize = 3;
        final int csize = 5;
        int[] rows = new int[rsize];
        int[] cols = new int[csize];

        int min = 50;
        int max = 100;

        int total = 0;
        double avg = 0.0;

        int grades[][] =  new int[rsize][csize];

        Random rand = new Random();

        for (int r=0; r<rsize; r++ ){

            for(int c=0; c<csize; c++)
            {
                grades[r][c] = rand.nextInt(max-min+1)+ min;
            }

    }

        for (int r=0; r<rsize; r++ ){

            System.out.println("Student" + r+1 + ":");
        for(int c=0; c<csize; c++)
        {
            System.out.println(grades[r][c]);
        }

    }

        for (int r=0; r<rsize; r++ ){

        for(int c=0; c<csize; c++)
        {
            total = total + grades[r][c];

        }
            avg = total / csize ;
            System.out.println("Avg is" + avg);
        total = 0;
        avg = 0.0;

    }


    }
}
