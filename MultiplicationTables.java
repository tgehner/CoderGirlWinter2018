import java.util.Scanner;

import static java.lang.System.out;

public class MultiplicationTables {
    public static void main (String[]args) {

        Scanner keyboard = new Scanner(System.in);

        out.println(" ");
        out.println("Welcome to Multiplication Tables!");
        out.println(" ");
        out.println("What multiplication number table would you like to see?");
        int number = keyboard.nextInt();

        for(int multiplication=1; multiplication <= 20; multiplication ++) {
            System.out.println(number + " * " + multiplication + " = " + number * multiplication);


        }
    }
}
