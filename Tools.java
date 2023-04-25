import java.util.Scanner;

public class Tools
{
    public static boolean hasRake;
    public static boolean hasSpade;
    public static boolean hasSpadeFork;
    public static boolean hasWheelbarrow;
    public static boolean hasWateringCan;
    private static Farmer farmer;
    
    public static void tools()
    {
        Scanner td = new Scanner(System.in);
        Scanner ts = new Scanner(System.in);
        System.out.println("What tool would you like to buy? [-1 to cancel]");
        System.out.println("1: Spade Fork - $20");
        System.out.println("2: Spade - $20");
        System.out.println("3: Wheelbarrow - $500");
        System.out.println("4: Rake - $15");
        System.out.println("5: Watering Can - $100");
        
        int tol = td.nextInt();
        switch (tol) 
        {
            case 1:  if(hasSpadeFork == false)
                     {
                         if(farmer.money >= 20)
                         {
                             hasSpadeFork = true;
                             farmer.money -= 20;
                             System.out.println("Purchase successful (-$20)");
                         }
                         else
                         {
                             System.out.println("Not enough money!");
                         }    
                     }
                     else
                     {
                         System.out.println("You already have a Spade Fork.");
                     }
                break;
            case 2:  if(hasSpade == false)
                     {
                         if(farmer.money >= 20)
                         {
                             hasSpade = true;
                             farmer.money -= 20;
                             System.out.println("Purchase successful (-$20)");
                         }
                         else
                         {
                             System.out.println("Not enough money!");
                         }    
                     }
                     else
                     {
                         System.out.println("You already have a Spade.");
                     }
                break;
            case 3:  if(hasWheelbarrow == false)
                     {
                         if(farmer.money >= 500)
                         {
                             hasWheelbarrow = true;
                             farmer.money -= 500;
                             System.out.println("Purchase successful (-$500)");
                         }
                         else
                         {
                             System.out.println("Not enough money!");
                         }    
                     }
                     else
                     {
                         System.out.println("You already have a Wheelbarrow.");
                     }
                break;
            case 4:  if(hasRake == false)
                     {
                         if(farmer.money >= 20)
                         {
                             hasRake = true;
                             farmer.money -= 15;
                             System.out.println("Purchase successful (-$15)");
                         }
                         else
                         {
                             System.out.println("Not enough money!");
                         }    
                     }
                     else
                     {
                         System.out.println("You already have a Rake.");
                     }  
                break;
            case 5:  if(hasWateringCan == false)
                     {
                         if(farmer.money >= 20)
                         {
                             hasWateringCan = true;
                             farmer.money -= 100;
                             System.out.println("Purchase successful (-$100)");
                         }
                         else
                         {
                             System.out.println("Not enough money!");
                         }    
                     }
                     else
                     {
                         System.out.println("You already have a Watering Can.");
                     }
                break;
            default: System.out.println("(Invalid command.)");
                break;
        }
    }    
}