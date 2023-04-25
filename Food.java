import java.util.ArrayList;
import java.util.Scanner;

public class Food
{
    static ArrayList<String> foods = new ArrayList<String>();
    static ArrayList<String> farmeroods = new ArrayList<String>();
    private static Farmer farmer;
    
    public ArrayList<String> getFoods()
    {
        return foods;
    }
    
    public ArrayList<String> getfarmeroods()
    {
        return farmeroods;
    }
    
    public static void seeAllFood()
    {
        int x = 0;
        int y = 0;
        int z = 0;
        for(int i = 0; i < foods.size(); i++)
        {
            if(foods.get(i).equals("bread"))
            {
                x++;
            }    
            else if(foods.get(i).equals("potato"))
            {
                y++;
            }    
            else
            {
                z++;
            }    
        }
        
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i = 0; i < farmeroods.size(); i++)
        {
            if(foods.get(i).equals("apples"))
            {
                a++;
            }    
            else if(foods.get(i).equals("grains"))
            {
                b++;
            }    
            else
            {
                c++;
            }    
        }
        
        if(farmeroods.size() == 0)
        {
            System.out.println("You have no food!");
        }
        else
        {    
            if(x > 0)
            {
                System.out.println("Bread: " + x);
            }    
            if(y > 0)
            {
                System.out.println("Potatoes: " + y);
            } 
            if(z > 0)
            {
                System.out.println("Corn: " + z);
            } 
            if(a > 0)
            {
                System.out.println("Apples: " + a);
            } 
            if(b > 0)
            {
                System.out.println("Grains: " + b);
            } 
            if(c > 0)
            {
                System.out.println("Fish: " + c);
            } 
        }
    }    
    
    public static void food()
    {
        Scanner fd = new Scanner(System.in);
        Scanner fs = new Scanner(System.in);
        System.out.println("What foods do you want to buy?");
        System.out.println("1: Bread - $50");
        System.out.println("2: Potatoes - $100");
        System.out.println("3: Corn - $80");

        int food = fd.nextInt();
        int fud = 0;
        switch (food) 
        {
            case 1:  if(farmer.money >= 50)
                     {
                         System.out.println("How many breads would you like to buy? [To cancel: -1]");
     
                         fud = fs.nextInt();
                         if(fud + 1 == 0)
                         {
                             System.out.println("Canceled");
                         }
                         else if(fud * 50 > farmer.money)
                         {
                             System.out.println("Not enough money (Missing $" + (50 - farmer.money) + ")");
                         }
                         else
                         {
                             for(int i = 0; i < fud; i++)
                             {
                                 foods.add("bread");
                             }    
                             System.out.println("Purchase Successful! (-$" + fud * 50 + ")");
                             farmer.money -= fud * 50;  
                         }    
                     }
                break;
            case 2:  if(farmer.money >= 100)
                     {
                         System.out.println("How many potatoes would you like to buy? [To cancel: -1]");
    
                         fud = fs.nextInt();
                         if(fud + 1 == 0)
                         {
                             System.out.println("Canceled");
                         }
                         else if(fud * 100 > farmer.money)
                         {
                             System.out.println("Not enough money (Missing $" + (100 - farmer.money) + ")");
                         }
                         else
                         {
                             System.out.println("Purchase Successful! (-$" + fud * 100 + ")");
                             farmer.money -= fud * 100;
                         }    
                     }
                break;
            case 3:  if(farmer.money >= 100)
                     {
                         System.out.println("How many corns would you like to buy? [To cancel: -1]");
     
                         fud = fs.nextInt();
                         if(fud + 1 == 0)
                         {
                             System.out.println("Canceled");
                         }
                         else if(fud * 80 > farmer.money)
                         {
                             System.out.println("Not enough money (Missing $" + (80 - farmer.money) + ")");
                         }
                         else
                         {
                             System.out.println("Purchase Successful! (-$" + fud * 80 + ")");
                             farmer.money -= fud * 80;
                         }    
                     }
                break;
            default: System.out.println("(Invalid command.)");
                break;
        }
    }

    public static void animalFood()
    {
        Scanner fd = new Scanner(System.in);
        Scanner fs = new Scanner(System.in);
        System.out.println("What animal foods do you want to buy?");
        System.out.println("1: Apples - $10");
        System.out.println("2: Grains - $5");
        System.out.println("3: Fish - $30");

        int food = fd.nextInt();
        int fud = 0;
        switch (food) 
        {
            case 1:  if(farmer.money >= 10)
                     {
                         System.out.println("How many apples would you like to buy? [To cancel: -1]");
     
                         fud = fs.nextInt();
                         if(fud + 1 == 0)
                         {
                             System.out.println("Canceled");
                         }
                         else if(fud * 10 > farmer.money)
                         {
                             System.out.println("Not enough money (Missing $" + (10 - farmer.money) + ")");
                         }
                         else
                         {
                             System.out.println("Purchase Successful! (-$" + fud * 10 + ")");
                             farmer.money -= fud * 10;
                         }    
                     }
                break;
            case 2:  if(farmer.money >= 5)
                     {
                         System.out.println("How many ounces of grain would you like to buy? [To cancel: -1]");
     
                         fud = fs.nextInt();
                         if(fud + 1 == 0)
                         {
                             System.out.println("Canceled");
                         }
                         else if(fud * 5 > farmer.money)
                         {
                             System.out.println("Not enough money (Missing $" + (5 - farmer.money) + ")");
                         }
                         else
                         {
                             System.out.println("Purchase Successful! (-$" + fud * 5 + ")");
                             farmer.money -= fud * 5;
                         }    
                     }
                break;
            case 3:  if(farmer.money >= 30)
                     {
                         System.out.println("How many fish would you like to buy? [To cancel: -1]");
     
                         fud = fs.nextInt();
                         if(fud + 1 == 0)
                         {
                             System.out.println("Canceled");
                         }
                         else if(fud * 30 > farmer.money)
                         {
                             System.out.println("Not enough money (Missing $" + (30 - farmer.money) + ")");
                         }
                         else
                         {
                             System.out.println("Purchase Successful! (-$" + fud * 30 + ")");
                             farmer.money -= fud * 30;
                         }    
                     }
                break;
            default: System.out.println("(Invalid command.)");
                break;
        }
    }    
}