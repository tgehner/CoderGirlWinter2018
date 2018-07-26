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
        int forVeggies;
        int forBurgers;
        int forSubs;
        int forSoup;


        out.println(" ");
        out.println("Checking sales goals.");
//VEGGIE SANDWICH
        out.println(" ");
        out.println("The sales goal for veggie sandwiches is 50.\n How many veggie sandwiches were sold today?");
        forVeggies = keyboard.nextInt();
        if (forVeggies >= goalForVeggies)
        {
            out.println("Made sales goal for veggie sandwiches!");
        } else {
            out.println("Fell" + " " + (goalForVeggies - forVeggies) + " " + "units short of sales goal.");
        }
//BURGERS
        out.println(" ");
        out.println("The sales goal for Burgers is 250. \n How many subs were sold today?");
        forBurgers = keyboard.nextInt();
        if (forBurgers >= goalForBurgers)
        {
            out.println("Made sales goal for Burgers!");
        } else {
            out.println ("Fell" + " " + (goalForBurgers-forBurgers) + " " + "units short of sales goal.");
        }
//SUBS
        out.println(" ");
        out.println("The sales goal for subs is 180.\n How many soups were sold today?");
        forSubs = keyboard.nextInt();
        if (forSubs >= goalForSubs)
        {
            out.println ("Made sales goal for Subs!");
        } else {
            out.println("Fell" + " " + (goalForSubs-forSubs) + " " + "units short of sales goal");
        }
//SOUP
        out.println(" ");
        out.println ("The sales goal for soup is 70. \n How many soups were sold?");
        forSoup = keyboard.nextInt();
        if (forSoup >= goalForSoup)
        {
            out.println("Made sales goal for soup!");
        } else {
            out.println("Fell" + " " + (goalForSoup-forSoup) + " " + "units short of sales goal.");
        }
//OVER-ALL GOAL
        out.println(" ");
        if (forBurgers >= goalForBurgers && forVeggies >= goalForVeggies && forSubs >= goalForSubs && forSoup >= goalForSoup)
        {
            out.println("Made sales goal for everything!");
        } else {
            out.println("Fell short of today's over-all sales goal.");
        }



    }
}