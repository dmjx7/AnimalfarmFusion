import java.util.ArrayList;
import java.util.Scanner;

public class Barnyard
{
    static ArrayList<Animal> barnyard = new ArrayList<Animal>();
    private static AnimalFarm animalF;
    private static Farmer farmer;
    private static Achievements ach;
    public static int barnyardLvl = 1;
    public static int barnyardCap = 10;
    
    public static ArrayList<Animal> getBarnyard()
    {
        return barnyard;
    }
    
    public static int getBarnyardLvl()
    {
        return barnyardLvl;
    }
    
    public static int getBarnyardCap()
    {
        return barnyardCap;
    }    
    
    public static void printAllAnimals()
    {
        for(int i = 0; i < barnyard.size(); i++)
        {
            int y = i + 1;
            System.out.println(y + ": " + barnyard.get(i).allAtributesString());
        }    
    }
    
    public static void addAnimal(int i, Animal a)
    {
        if(i > barnyard.size())
        {
            System.out.println("Invalid command.");
        }
        else if(i == barnyard.size())
        {
            i -= 1;
            barnyard.add(i, a);
        }
        else
        {
            barnyard.add(i, a);
        }
    }
    
    public static void removeAnimal()
    {
        Scanner anim = new Scanner(System.in);
        
        printAllAnimals();
        System.out.println("What animal would you like to remove? (Input with number)");
        int animal = anim.nextInt();
        if(animal > barnyard.size() - 1)
        {
            System.out.println("Invalid command.");
        }
        else
        {
            barnyard.remove(barnyard.get(animal - 1));
            if(barnyard.size() == 0)
            {
                System.out.println("Remove successful! You now have an empty barnyard. (Lost commands 5 and 6)");
            }
            else
            {
                System.out.println("Remove successful!");
            }
        }    
    }
    
    public static void animalPrices(Animal a)
    {
        if(a.gitType() == "horse")
        {
            farmer.money += 150;
            animalF.amMoney += 150;
        }
        else if(a.gitType() == "pig")
        {
            farmer.money += 40;
            animalF.amMoney += 40;
        }
        else if(a.gitType() == "sheep")
        {
            farmer.money += 80;
            animalF.amMoney += 80;
        }
        else if(a.gitType() == "goat")
        {
            farmer.money += 80;
            animalF.amMoney += 80;
        }    
        else if(a.gitType() == "cow")
        {
            farmer.money += 185;
            animalF.amMoney += 185;
        }    
        else if(a.gitType() == "rooster")
        {
            farmer.money += 25;
            animalF.amMoney += 25;
        }    
        else if(a.gitType() == "chicken")
        {
            farmer.money += 25;
            animalF.amMoney += 25;
        }    
        else if(a.gitType() == "duck")
        {
            farmer.money += 20;
            animalF.amMoney += 20;
        }    
    }    
    
    public static void buyAnimals()
    {
        Scanner numOfAnimals = new Scanner(System.in);
        System.out.println("How many animals would you like to buy? ($100 each animal) [To cancel: -1]");

        int animals = numOfAnimals.nextInt();
        if(animals + 1 == 0)
        {
            System.out.println("Canceled");
        }
        else if(animals * 100 > farmer.money)
        {
            System.out.println("Not enough money (Missing $" + (animals * 100 - farmer.money) + ")");
        }
        else if((animals + getBarnyard().size()) > getBarnyardCap())
        {
            System.out.println("Not enough space in the barnyard. (" + getBarnyard().size() + "/" + getBarnyardCap() + ")");
        }    
        else
        {
            for(int i = 0; i < animals; i++)
            {
                getBarnyard().add(new Animal());
                farmer.money-= 100;
            }
            
            printAllAnimals();
            if(getBarnyard().size() - animals == 0)
            {
                System.out.println("You unlocked a command(s)! (0 to see commands)");
            }
            if(ach.firstAnimal == false)
            {
                System.out.println("New Achievement: \"New Friend\"");
                animalF.achiCounter++;
                if(animalF.achiCounter == 1)
                {
                    System.out.println("(See all achievements in settings)");
                }    
                ach.firstAnimal = true;
            }  
        }
    }

    public static void sellAnimals()
    {  
        Scanner inp = new Scanner(System.in);
        
        System.out.println("How many animals would you like to sell? (You have " + barnyard.size() + " animals.) [-1 to cancel]");
        int animals = inp.nextInt();
        
        if(animals + 1 == 0)
        {
            System.out.println("Canceled");
        }    
        else if(animals - 1 > barnyard.size() - 1)
        {
            System.out.println("Invalid command.");
        }
        else if(animals - 1 == barnyard.size() - 1)
        {
            System.out.println("Are you sure you would like to sell all the animals in your barnyard?");
            System.out.println("1: Yes");
            System.out.println("2: No");
            int decision = inp.nextInt();
            
            switch (decision) 
            {
                case 1:  while(barnyard.size() != 0)
                         {
                             animalPrices(barnyard.get(0));
                             barnyard.remove(barnyard.get(0));
                         }
                         System.out.println("Sold all animals for $" + animalF.amMoney + "!");
                         System.out.println("You now have an empty barnyard. (Lost commands 5 and 6 in main commands list)");
                     break;
                case 2:  sellAnimals();
                     break;
                default: System.out.println("Invalid command.");
                         sellAnimals();
            } 
            if(ach.sellAnimal == false)
            {
                System.out.println("New Achievement: \"Bye Bye Animal, Hello Mulahh\"");
                animalF.achiCounter++;
                if(animalF.achiCounter == 1)
                {
                    System.out.println("(See all achievements in settings)");
                } 
                ach.sellAnimal = true;
            }  
        }
        else
        {
            for(int i = 0; i < animals; i++)
            {
                printAllAnimals();
                System.out.println("Which animals would you like to sell?");
                int animal = inp.nextInt();
                
                if(animal - 1 > barnyard.size() - 1)
                {
                    System.out.println("Invalid command.");
                }
                else
                {
                    animalPrices(barnyard.get(animal - 1));
                    barnyard.remove(barnyard.get(animal - 1));
                    System.out.println("Sold for $" + animalF.amMoney + "!");
                }
            }
            if(ach.sellAnimal == false)
            {
                System.out.println("New Achievement: \"Bye Bye Animal, Hello Mulahh\"");
                animalF.achiCounter++;
                if(animalF.achiCounter == 1)
                {
                    System.out.println("(See all achievements in settings)");
                } 
                ach.sellAnimal = true;
            }  
        }
        
        animalF.amMoney = 0;
    }    
    
    public static void upgradeBarnyard()
    {
        Scanner inp = new Scanner(System.in);
        int cost = 300 + (200 * barnyardLvl);
        
        System.out.println("It will cost you $" + cost + " to upgrade your barnyard to level " + (barnyardLvl + 1) + ".");
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        
        System.out.println("Proceed?");
        System.out.println("1: Yes");
        System.out.println("2: No");
        int answer = inp.nextInt();
        switch (answer) 
        {
            case 1:  System.out.println("Renevating...");
                     try
                     {
                         Thread.sleep(2000);
                     }
                     catch(InterruptedException e)
                     {
                         System.out.println(e);
                     }
                     System.out.println(".");
                     try
                     {
                         Thread.sleep(2500);
                     }
                     catch(InterruptedException e)
                     {
                         System.out.println(e);
                     }
                     System.out.println(".");
                     try
                     {
                         Thread.sleep(2500);
                     }
                     catch(InterruptedException e)
                     {
                         System.out.println(e);
                     }
                     System.out.println(".");
                     try
                     {
                         Thread.sleep(2500);
                     }
                     catch(InterruptedException e)
                     {
                         System.out.println(e);
                     }
                     System.out.println("Done!");
                     try
                     {
                         Thread.sleep(800);
                     }
                     catch(InterruptedException e)
                     {
                         System.out.println(e);
                     }
                     System.out.println("You're barnyard is now level " + (barnyardLvl + 1) + "! (Animal capacity increased by " + (barnyardCap * barnyardLvl) + ")");
                     barnyardCap += barnyardCap * barnyardLvl;
                     barnyardLvl++;
                 break;
            case 2:  System.out.println("Canceled");
                 break;
            default: System.out.println("Invalid command.");
                     sellAnimals();
        }   
    }    
}