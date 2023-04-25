import java.util.ArrayList;
import java.util.Scanner;

public class AnimalFarm
{
    public static int amMoney;
    public static boolean endGame;
    private static Barnyard barnYard;
    private static InteractionChamber intChamber;
    private static Tools tool;
    private static Food food;
    private static Town town;
    private static Traveling traveling;
    private static Farmer farmer;
    private static Achievements ach;
    public static int achiCounter;

    public static void main() throws InterruptedException
    {
        // add farmer stats - race, size, height, weight (for tiredness from work, ability to do work, etc.)
        // add work timeout, animal hunger, farmer hunger
        // add more stats in seeStats
        // make titles for accomplishing things
        // make town with dif stores
        // add shelters for animals (can't interact with them when they are in shelter)
        // add seasons so you have to buy proper clothes, house animals in shelters, farmer.healthdecreases when too cold, random blizzards/heatwaves, etc.
        // add random deaths
        // add fights with animals 
        // add "travel to barnyard, town, etc" - could add questions during travel or games, etc.
        // add see food commands
        // detele entire screen when u die with \b and cls
        // make jobs for different tools, other tools can break
        
        barnYard = new Barnyard();
        farmer = new Farmer();
        farmer.money = 2000000;
        farmer.health= 100;
        barnYard.barnyardLvl = 1;
        barnYard.barnyardCap = 10;
        tool.hasRake = true;
        ach.workAchievement = false;
        ach.happyAnimal = false;
        ach.sadAnimal = false;
        ach.jackpot = false;
        ach.mutant = false;
        ach.sellAnimal = false;
        ach.firstAnimal = false;
        endGame = false;

        System.out.println("Welcome to Animal Farm!");
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("To start off, you have $20, an empty barnyard, and a rake.\n");
        try
        {
            Thread.sleep(2200);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("What would you like to do?");
        System.out.println("0: See Command List");
        System.out.println("1: Settings");
        System.out.println("2: Work");
        System.out.println("3: Visit Town");
        System.out.println("4: Buy Animal(s)");
        System.out.println("9: End Game");

        while(endGame != true)
        {
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();

            switch (userInput) {
                case "0":  seeCmds();
                    break;
                case "1":  settings();
                    break;
                case "2":  work();
                    break;
                case "3":  traveling.travel("town");
                           visitTown();
                    break;
                case "4":  barnYard.buyAnimals();
                    break;
                case "5":  if(barnYard.getBarnyard().size() == 0)
                           {
                               System.out.println("Invalid command.");
                           }    
                           else
                           {
                               barnYard.sellAnimals();
                           }    
                    break;
                case "6":  if(barnYard.getBarnyard().size() == 0)
                           {
                               System.out.println("Invalid command.");
                           }    
                           else
                           {
                               traveling.travel("barnyard");
                               visitBarnyard();
                           }
                    break;         
                case "9":  endGame = true;
                           System.out.println("Imagine quitting :/");
                           try
                           {
                               Thread.sleep(1500);
                           }
                           catch(InterruptedException e)
                           {
                               System.out.println(e);
                           }
                           System.out.println("such an L smh");
                           try
                           {
                               Thread.sleep(1000);
                           }
                           catch(InterruptedException e)
                           {
                               System.out.println(e);
                           }
                           System.out.println("but like");
                           try
                           {
                               Thread.sleep(1200);
                           }
                           catch(InterruptedException e)
                           {
                               System.out.println(e);
                           }
                    break;
                default:    System.out.println("(Invalid command.)");
                    break;
            }
            
            if(farmer.health<= 0)
            {
                endGame = true;
                for(int i = 0; i < 1000; i++)
                {
                    System.out.println("\b");
                }    
                
                try
                {
                    Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
                System.out.println("You died...");
                try
                {
                    Thread.sleep(1500);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
                System.out.println("wow...");
                try
                {
                    Thread.sleep(1200);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
                break;
            }    
        }
 
        farmer.health= 0;
        System.out.println("You died with:");
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println(farmer.money+ " DOLLARS!!");
        try
        {
            Thread.sleep(1500);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println(barnYard.getBarnyard().size() + " ANIMALS!!");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.print(".");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.print(".");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.print(".");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        if(tool.hasRake == true)
        {
            System.out.println(" AND A RAAAAAKE!!!");
        }
        else
        {
            System.out.println(" and no rake? L bozo. don't play this again if u not have rake");
            try
            {
                Thread.sleep(1100);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("like");
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("come on bru");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("u so broke u cant afford rake?");
        }
        while(barnYard.getBarnyard().size() != 0)
        {
            barnYard.getBarnyard().remove(barnYard.getBarnyard().get(0));
        }   
    }
    
    public static void test()
    {
        System.out.println("test");
    }    

    public static void seeCmds()
    {
        System.out.println("0: See Command List");
        System.out.println("1: Settings");
        System.out.println("2: Work");
        System.out.println("3: Visit Town");
        System.out.println("4: Buy Animal(s)");
        if(barnYard.getBarnyard().size() > 0)
        {
            System.out.println("5: Sell Animal(s)");
            System.out.println("6: Visit Barnyard");
        }    
        System.out.println("9: End Game");
    }    

    public static void settings()
    {
        Scanner b = new Scanner(System.in);
        
        System.out.println("   0: See Commands");
        System.out.println("   1: Leave Settings");
        System.out.println("   2: See Stats");
        System.out.println("   3: See Achievements");
        int breakN = 0;
        while(breakN != 1)
        {
        
            
            int a = b.nextInt();
            switch (a) {
            case 0:   System.out.println("   0: See Commands");
                      System.out.println("   1: Leave Settings");
                      System.out.println("   2: See Stats");
                      System.out.println("   3: See Achievements");  
                break;
            case 1:   breakN = 1;
                      System.out.println("*Left Settings*");
                break;
            case 2:   System.out.println("Age: " + farmer.gitAge());
                      System.out.println("Height: " + farmer.gitHeight() + " cm");
                      System.out.println("Weight: " + farmer.gitWeight() + " llbs");
                      System.out.println("Money: $" + farmer.money);
                      System.out.println("Barnyard Level: " + barnYard.getBarnyardLvl());
                      System.out.println("Animals: " + barnYard.getBarnyard().size() + "/" + barnYard.getBarnyardCap());
                      System.out.println("Tools:");
                      if(tool.hasRake == true)
                      {
                          System.out.println("  -Rake");
                      }    
                      if(tool.hasSpade == true)
                      {
                          System.out.println("  -Spade");
                      } 
                      if(tool.hasSpadeFork == true)
                      {
                          System.out.println("  -Spade Fork");
                      } 
                      if(tool.hasWateringCan == true)
                      {
                          System.out.println("  -Watering Can");
                      } 
                      if(tool.hasWheelbarrow == true)
                      {
                          System.out.println("  -Wheelbarrow");
                      }
                break;
            case 3:   ach.achievementInfo();
                break;
            default:  System.out.println("(Invalid command.)");
                break;
            }
        }    
    }    

    private static void work()
    {
        if(ach.workAchievement == false)
        {
            System.out.println("New Achievement: \"Put In the Work, Put In the Hours\"");
            achiCounter++;
            if(achiCounter == 1)
            {
                System.out.println("(See all achievements in settings)");
            } 
            ach.workAchievement = true;
        }    
        
        if(tool.hasRake == true)
        {
            int profit = Randomizer.nextInt(1, 50);
            int moneyMade = Randomizer.nextInt(10, 25);
            switch (profit) {
                case 1:  farmer.money+= 0;
                    System.out.println("Whoops, looks like you earned nothing today.");
                    break;
                case 2:  farmer.money+= 0;
                    System.out.println("Whoops, looks like you earned nothing today.");
                    break;
                case 3:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 4:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 5:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 6:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 7:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 8:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 9:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 10: farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 11:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 12:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 13:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 14:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 15:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 16:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 17:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 18:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 19:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 20:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 21:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 22:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 23:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 24:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 25:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 26:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 27:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 28:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 29:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 30:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 31:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 32:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 33:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 34:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 35:  farmer.money+= 1000000;
                    System.out.println("JackPot!! You earned $1,000,000 (You have $" + farmer.money+ ")");
                    if(ach.jackpot == false)
                    {
                        System.out.println("New Achievement: \"Millionaire\"");
                        achiCounter++;
                        if(achiCounter == 1)
                        {
                            System.out.println("(See all achievements in settings)");
                        }    
                        ach.jackpot = true;
                    }    
                    break;
                case 36:  farmer.health-= 50;
                    System.out.println("Ouch! You were hit by a boulder in work! (-50% health)");
                    break;
                case 37:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 38:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 39:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 40:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 41:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 42:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 43:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 44:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 45:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 46:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 47:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 48:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 49:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
                case 50:  farmer.money+= moneyMade;
                    System.out.println("Nice, you earned $" + moneyMade + " from this hour's labor. (You have $" + farmer.money+ ")");
                    break;
            }

            int breakChance = Randomizer.nextInt(0, 15);
            if(breakChance == 6)
            {
                tool.hasRake = false;
                System.out.println("Dang, your rake broke.");
            }
        }
        else
        {
            System.out.println("You can't work, you need a rake.");
        }    
    }

    public static void visitBarnyard()
    {
        Scanner act = new Scanner(System.in);

        System.out.println("*You are now at the barnyard*");
        try
        {
            Thread.sleep(800);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("What would you like to do?");
        System.out.println("   0: See barnyard commands");
        System.out.println("   1: Exit");
        System.out.println("   2: See All Animals");
        System.out.println("   3: Add Animal to Barnyard");
        System.out.println("   4: Remove Animal from Barnyard");
        System.out.println("   5: Interact with an Animal");
        System.out.println("   6: Breed Animals");
        
        int breakNumber = 0;
        while(breakNumber != 1)
        {
            if(farmer.health<= 0)
            {
                breakNumber = 1;
            }
            int action = act.nextInt();
            switch (action) 
            {
                case 0: System.out.println("   0: See barnyard commands");
                        System.out.println("   1: Exit");
                        System.out.println("   2: See All Animals");
                        System.out.println("   3: Add Animal to Barnyard");
                        System.out.println("   4: Remove Animal from Barnyard");
                        System.out.println("   5: Interact with an Animal");
                        System.out.println("   6: Breed Animals");
                    break;
                case 1: System.out.println("Exited");
                        breakNumber = 1;
                    break;
                case 2: barnYard.printAllAnimals();
                        System.out.println("What would you like to do next at the barnyard?");
                    break;
                case 3: System.out.println("You must first buy an animal. Proceed?");
                        System.out.println("1: Yes");
                        System.out.println("2: No");
                        int response = act.nextInt();
                         switch (response)
                        {
                            case 1: if(farmer.money- 100 < 0)
                                    {
                                        System.out.println("Not enough farmer.money.");
                                    }
                                    else
                                    {
                                        farmer.money-= 100;
                                        Animal animal = new Animal();
                                        System.out.println("After which animal would you like to place your new animal?");
                                        barnYard.printAllAnimals();
                                        int place = act.nextInt();
                                        barnYard.addAnimal(place, animal);
                                        System.out.println("Animal added!");
                                    }
                                    break;
                            case 2: System.out.println("Canceled");
                                    break;
                        }
                        System.out.println("What would you like to do next at the barnyard?");
                    break;
                case 4: barnYard.removeAnimal();
                        System.out.println("What would you like to do next at the barnyard?");
                    break;
                case 5: intChamber.interactAnimal();
                        if(farmer.health <= 0)
                        {
                            breakNumber = 1;
                        }
                        else
                        {
                            System.out.println("What would you like to do next at the barnyard?");
                        }
                    break;
                case 6: intChamber.breedAnimals();
                        System.out.println("What would you like to do next at the barnyard?");
                    break;
                default: System.out.println("(Invalid command.)");
                    break;
            }
        }    
    }

    public static void visitTown()
    {
        Scanner shopItem = new Scanner(System.in);
        int breakN = 0;
        
        System.out.println("*You are now at the town*");
        try
        {
            Thread.sleep(800);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("Where would you like to go? (Input using numbers)");
        System.out.println("  0: See Commands");
        System.out.println("  1: Leave");
        System.out.println("  2: Supermarket");
        System.out.println("  3: Hospital");
        System.out.println("  4: Store");

        while(breakN != 1)
        {
            int buyItem = shopItem.nextInt();
            switch (buyItem) {
                case 0:   System.out.println("  0: See Commands");
                          System.out.println("  1: Leave");
                          System.out.println("  2: Supermarket");
                          System.out.println("  3: Hospital");
                          System.out.println("  4: Store");
                    break;
                case 1:   breakN = 1;
                          System.out.println("*Left Town*");
                    break;
                case 2:   
                          town.visitSupermarket();
                    break;
                case 3:   
                          town.visitHospital();
                    break;
                case 4:   
                          town.visitStore();
                    break;
                default:  System.out.println("(Invalid command.)");
                    break;
            }
        }    
    }
}