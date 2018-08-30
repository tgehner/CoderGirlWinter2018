import java.util.Scanner;

import static java.lang.System.out;

public class MultiplicationTables {
    public static void main (String[]args) {

        Scanner keyboard = new Scanner(System.in);

        out.println(" ");
        out.println("Welcome to Multiplication Tables!");
        out.println(" ");
        out.println("What size would you like to see?");
        int number = keyboard.nextInt();

        for(int mult=0; mult <= number; mult++){
        for(int multNo=0; multNo <= number; multNo++) {
            out.println(mult + " * " + multNo + " = " + mult * multNo);
        }


        }
    }
}
