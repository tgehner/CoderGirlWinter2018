import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop
{
    public static void main (String[] args)
    {
        Scanner keyboard=new Scanner(System.in);
        int goalForVeggies=50;
        int goalForBurgers=250;
        int goalForSubs=180;
        int goalForSoup=70;

        out.println(" ");
        out.println("Checking sales goals.");

        out.println(" ");
        out.println("The sales goal for veggie sandwiches is 50. \n How many veggie sandwiches were sold today?");
        goalForVeggies = keyboard.nextInt();
        if (goalForVeggies >= 50)
        {
            out.println("Made sales goal for veggie sandwiches!");
        } else {
            out.println("Fell" + " " + (50 - goalForVeggies) + " " + "units short of sales goal.");
        }

        out.println(" ");
        out.println("The sales goal for Burgers is 250. \n How many subs were sold today?");
        goalForBurgers = keyboard.nextInt();
        if (goalForBurgers >= 250)
        {
            out.println("Made sales goal for Burgers!");
        } else {
            out.println ("Fell" + " " + (250 - goalForBurgers) + " " + "units short of sales goal.");
        }

        out.println(" ");
        out.println("The sales goal for subs is 180.\n How many soups were sold today?");
        goalForSubs = keyboard.nextInt();
        if (goalForSubs >= 180)
        {
            out.println ("Made sales goal for Subs!");
        } else {
            out.println("Fell" + " " + (180 - goalForSubs) + " " + "units short of sales goal");
        }

        out.println(" ");
        out.println ("The sales goal for soup is 70. \n How many soups were sold?");
        goalForSoup = keyboard.nextInt();
        if (goalForSoup >= 70)
        {
            out.println("Made sales goal for soup!");
        } else {
            out.println("Fell" + " " + (70 - goalForSoup) + " " + "units short of sales goal.");
        }

        out.println(" ");
        if (goalForVeggies >= 50)
        if (goalForBurgers >= 250)
        if (goalForSubs >= 180)
        if (goalForSoup >= 70)
        {
            out.println("Made sales goal for everything!");
        } //else {
            //out.println("Fell short of today's over-all sales goal.");
        //}



    }
}