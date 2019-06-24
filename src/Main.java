import java.util.Scanner;
import java.io.*;


public class Main {

    //possibilities
    //Kitchen>open fridge>drink strange milk
    //Kitchen>open fridge>eat leftovers
    //Kitchen>open cabinet>eat a can of beans
    //Kitchen>open cabinet>take a plate

    public static void fridge(Scanner in,String x)
    {
        System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty.\n" +
                "Would you like to eat some of the food? (\"milk\" or \"leftovers\" or \"neither\")");
        x = in.next();
        x.toLowerCase();

        if(x.equals("milk"))
        {
            System.out.println("You died from spoiled milk...");
        }
        else if(x.equals("leftovers"))
        {
            System.out.println("You died from poisoned food...");
        }
        else
        {
            System.out.println("You died of starvation...");
        }
    }

    public static void cabinet(Scanner in,String x)
    {
        System.out.println("Inside the cabinet you see food and stuff.  It looks pretty nasty.\n" +
                "Would you like a plate or eat the beans? (\"plate\" or \"beans\" or \"neither\")");
        x = in.next();
        x.toLowerCase();

        if(x.equals("plate"))
        {
            System.out.println("You dropped the plate and cut your foot off...");
            System.out.println("You died from excessive bleeding...");
        }
        else if(x.equals("beans"))
        {
            System.out.println("You died from poisoned food...");
        }
        else
        {
            System.out.println("A ghost came and ate your soul...you're dead");
        }
    }

    public static void bedroom(Scanner in,String x)
    {
        System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  The\n" +
                "bed is unmade.  In the back of the room, the closet door is ajar.  Would you\n" +
                "like to open the door or lay on the bed? (\"door\" or \"bed\" or \"runaway\")");
        x = in.next();
        x.toLowerCase();

        if(x.equals("door"))
        {
            System.out.println("The door led to a blackhole and you got lost in space and time...");
        }
        else if(x.equals("bed"))
        {
            System.out.println("The bed fell through the floor and you plummeted to your death.");
        }
        else
        {
            System.out.println("You escaped and make it out alive!");
        }
    }

    public static void bathroom(Scanner in,String x)
    {
        System.out.println("You are in a plush bathroom, with expensive-looking hardwood furniture.  The\n" +
                "bathroom is gross and dirty.  There is a very gross toilet seat and a very foggy mirror.  Would you\n" +
                "like to open the toilet seat or see into the mirror? (\"toilet\" or \"mirror\" or \"runaway\")");
        x = in.next();
        x.toLowerCase();

        if(x.equals("toilet"))
        {
            System.out.println("Your eyes burned from the fowl stench...you're dead.");
        }
        else if(x.equals("mirror"))
        {
            System.out.println("You saw your reflection and turned to stone.");
        }
        else
        {
            System.out.println("You ran away and got out safely, but you fell into a ditch and died.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Justin's Tiny ADVENTURE!!");

        Scanner in = new Scanner(System.in);
        String input = "";

        System.out.println("You are in a Haunted Mansion, would you like to go \"Upstairs\" or into the \"Kitchen\"?");
        input = in.next();
        input = input.toLowerCase();

        if (input.equals("kitchen"))
        {
            System.out.println("There is a long counter top with dirty dishes everywhere. Off to one side\nthere is, as you'd expect, a \"refrigerator\". You may open the refrigerator\nor look in a \"cabinet\".");
            input = in.next();
            input = input.toLowerCase();

            if(input.equals("refrigerator"))
            {
                fridge(in,input);
            }
            else
            {
                cabinet(in,input);
            }
        }
        else if (input.equals("upstairs"))
        {
            System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master\n\"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like\nto go?");
            input = in.next();
            input = input.toLowerCase();

            if(input.equals("bedroom"))
            {
                bedroom(in,input);
            }
            else
            {
                bathroom(in,input);
            }
        }
        else
        {
            System.out.println("Invalid Response, you may not enter the Mansion!!");
        }
        System.out.println("Thanks for playing, I hope you survived!");
    }
}
