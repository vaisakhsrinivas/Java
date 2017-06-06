package Input;

import java.util.Scanner;

/**
 * Created by vaisakh on 01/06/17.
 */
public class UserInput {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        int number;
        int number1;
        int sum;

        number = input.nextInt();
        number1 = input.nextInt();

        sum = number + number1 ;

        System.out.println("Enter your name");

        String name = s.nextLine();

        System.out.println(sum);
        System.out.println(name);
    }
}
