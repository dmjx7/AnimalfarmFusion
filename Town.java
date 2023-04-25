import java.util.ArrayList;
import java.util.Scanner;

public class Town
{
    static ArrayList<Animal> riskAnim = new ArrayList<Animal>();
    private static Farmer farmer;
    private static Tools tool;
    private static Food food;
    private static Barnyard barnyard;
    private static Animal anim;
    
    public static void visitSupermarket()
    {
        Scanner shopItem = new Scanner(System.in);
        int breakN = 0;
        
        System.out.println("*You are now at the Supermarket*");
        try
        {
            Thread.sleep(800);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("What would you like to buy? (Input using numbers)");
        System.out.println("0: See Commands");
        System.out.println("1: Leave");
        System.out.println("2: Food - (Price varies)");
        System.out.println("3: Animal Food - (Price varies)");
        
        while(breakN != 1)
        {
            int buyItem = shopItem.nextInt();
            switch (buyItem) {
                case 0:   System.out.println("0: See Commands");
                          System.out.println("1: Leave");
                          System.out.println("2: Food - (Price varies)");
                          System.out.println("3: Animal Food - (Price varies)");
                    break;
                case 1:   breakN = 1;
                          System.out.println("*Left supermarket*");
                    break;
                case 2:   food.food();
                    break;
                case 3:   food.animalFood();
                    break;
                default:  System.out.println("(Invalid command.)");
                    break;
            }
        }
    }   
    
    public static void visitHospital()
    {
        Scanner hosp = new Scanner(System.in);
        int breakN = 0;
        
        System.out.println("*You are now at the hospital*");
        try
        {
            Thread.sleep(800);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("What would you like to do at the hospital?");
        System.out.println("0: See Commands");
        System.out.println("1: Leave");
        System.out.println("2: Check Animal Health");
        System.out.println("3: Check Your Health"); 
        System.out.println("4: Buy Medicine");
        
        while(breakN != 1)
        {
            int buyItem = hosp.nextInt();
            switch (buyItem) {
                case 0:   System.out.println("0: See Commands");
                          System.out.println("1: Leave");
                          System.out.println("2: Check Animal Health");
                          System.out.println("3: Check Your Health");
                    break;
                case 1:   breakN = 1;
                          System.out.println("*Left hospital*");
                    break;
                case 2:   if(barnyard.getBarnyard().size() == 0)
                          {
                              System.out.println("You don't have any animals!");
                          }    
                          else
                          {
                              for(int i = 0; i < barnyard.getBarnyard().size(); i++)
                              {
                                  int h = barnyard.getBarnyard().get(i).gitHealth();
                                  if(h <= 20)
                                  {
                                      riskAnim.add(barnyard.getBarnyard().get(i));
                                  }    
                              } 
                          }    
                          if(riskAnim.size() == 0)
                          {
                              System.out.println("All your animals are healthy!");
                          }    
                          else
                          {
                              System.out.println("You have " + riskAnim.size() + " animal(s) at risk!");
                              for(int i = 0; i < riskAnim.size(); i++)
                              {
                                  int y = i + 1;
                                  System.out.println("!! " + y + ": " + barnyard.getBarnyard().get(i).gitName() + ": " + barnyard.getBarnyard().get(i).gitHealth() + "%");
                              }    
                          }    
                    break;
                case 3:   if(farmer.health <= 20)
                          {
                              System.out.println("You are at risk of dying! Buy medicine now! (Health: " + farmer.health + "%)");
                          }    
                          else if(farmer.health <= 50)
                          {
                              System.out.println("Your health is below half. Buy medicine just in case. (Health: " + farmer.health + "%)");
                          }    
                          else if(farmer.health <= 75)
                          {
                              System.out.println("Your health is dropping. You don't need it, but you should get medicine. (Health: " + farmer.health + "%)");
                          }    
                          else
                          {
                              System.out.println("You are healthy!");
                          }    
                    break;
                default:  System.out.println("(Invalid command.)");
                    break;
            }
        }    
    }    
    
    public static void visitStore()
    {
        Scanner storeItem = new Scanner(System.in);
        int breakN = 0;
        
        System.out.println("What would you like to buy? (Input using numbers) [To cancel: -1]");
        System.out.println("0: See Commands");
        System.out.println("1: Leave");
        System.out.println("2: Clothes - (Price varies)");
        System.out.println("3: Tools - (Price varies)");
        
        while(breakN != 1)
        {
            int buyItem = storeItem.nextInt();
            switch (buyItem) {
                case 0:   System.out.println("0: See Commands");
                          System.out.println("1: Leave");
                          System.out.println("2: Tools - (Price varies)");
                          System.out.println("3: Food - (Price varies)");
                          System.out.println("4: Animal Food - (Price varies)");
                    break;
                case 1:   breakN = 1;
                          System.out.println("*Left store*");
                    break;
                case 2:   
                    break;
                case 3:   tool.tools();
                    break;
                default:  System.out.println("(Invalid command.)");
                    break;
            }
        } 
    }    
}    