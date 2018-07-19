
import java.util.Scanner;

import static java.lang.System.out;

public class GroceryList
{
    public static void main (String[] args)
    {
    Scanner keyboard = new Scanner(System.in);

        float groceryTotal=0;

out.println(" ");
out.println("Please list three items on your grocery shopping list.");
out.println(" ");

out.println("Item 1?");
    String item1 = keyboard.nextLine();

out.println("Item 2?");
    String item2 = keyboard.nextLine();

out.println("Item 3?");
    String item3 = keyboard.nextLine();

out.println(" ");
out.println(" ");
out.println("Now, please enter the quantity of each item.");
out.println(" ");

out.println("How many" + " " + item1 + "?");
    int groceryNumber1 = keyboard.nextInt();

out.println("How many" + " " + item2 + "?");
    int groceryNumber2 = keyboard.nextInt();

out.println("How many" + " " + item3 + "?");
    int groceryNumber3 = keyboard.nextInt();

out.println(" ");
out.println(" ");
out.println("Now, please enter the price of each Item.");
out.println(" ");

out.println("How much does one" + " " + item1 + " " + "cost?");
    float itemCost1 = keyboard.nextFloat();

 out.println("How much does one" + " " + item2 + " " + "cost?");
    float itemCost2 = keyboard.nextFloat();

        out.println("How much does one" + " " + item3 + " " + "cost?");
    float itemCost3 = keyboard.nextFloat();

out.println("Calculating your grocery bill.");
groceryTotal = (groceryNumber1 * itemCost1) + (groceryNumber2 * itemCost2) + (groceryNumber3 * itemCost3);


    out.println("Your total cost is" + " " + groceryTotal);

    }
}
