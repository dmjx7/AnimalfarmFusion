import java.util.Scanner;

public class InteractionChamber
{
    private static Farmer farmer;
    private static Barnyard barnyard;
    
    public static void breedAnimals()
    {
        
    }    
    
    public static void interactAnimal()
    {
        Scanner interact = new Scanner(System.in);
        int a = 0;
        int breakNumber = 0;
        int breakN = 0;

        barnyard.printAllAnimals();
        System.out.println("Who would you like to interact with? (Input using number) [To cancel: -1]");
        int animal = interact.nextInt();
        a = animal - 1;
        
        if(a == -2)
        {
            System.out.println("Canceled");
        }
        else
        {
            System.out.println("What do you want to do to " + barnyard.getBarnyard().get(a).gitName() + "?");
            System.out.println("     0: See Interaction Commands");
            System.out.println("     1: Leave animal");
            System.out.println("     2: Pet");
            System.out.println("     3: Feed");
            System.out.println("     4: Listen");
            System.out.println("     5: Kick");
            System.out.println("     6: See All Atributes");
            while(breakNumber != 1)
            {
                int interaction = interact.nextInt();
                switch (interaction) 
                {
                    case 0:  System.out.println("     0: See Interaction Commands");
                             System.out.println("     1: Leave animal");
                             System.out.println("     2: Pet");
                             System.out.println("     3: Feed");
                             System.out.println("     4: Listen");
                             System.out.println("     5: Kick");
                             System.out.println("     6: See All Atributes");
                        break;
                    case 1:  System.out.println("*Left animal* You are now at the barnyard.");
                             breakNumber = 1;
                        break;
                    case 2:  barnyard.getBarnyard().get(a).pet();
                             if(farmer.health <= 0)
                             {
                                 breakNumber = 1;
                             }
                             else
                             {
                                 try
                                 {
                                     Thread.sleep(1000);
                                 }
                                 catch(InterruptedException e)
                                 { 
                                     System.out.println(e);
                                 }
                                 System.out.println("What do you want to do next to " + barnyard.getBarnyard().get(a).gitName() + "?");
                             }
                        break;
                    case 3:  barnyard.getBarnyard().get(a).feed(); 
                             if(farmer.health <= 0)
                             {
                                 breakNumber = 1;
                             }
                             else
                             {
                                 try
                                 {
                                     Thread.sleep(1600);
                                 }
                                 catch(InterruptedException e)
                                 { 
                                     System.out.println(e);
                                 }
                                 System.out.println("What do you want to do next to " + barnyard.getBarnyard().get(a).gitName() + "?");
                             }
                        break;
                    case 4:  barnyard.getBarnyard().get(a).listen();
                             try
                             {
                                 Thread.sleep(1300);
                             }
                             catch(InterruptedException e)
                             { 
                                 System.out.println(e);
                             }
                             System.out.println("What do you want to do next to " + barnyard.getBarnyard().get(a).gitName() + "?");
                        break;
                    case 5:  barnyard.getBarnyard().get(a).kick(); 
                             if(farmer.health <= 0)
                             {
                                 breakNumber = 1;
                             }
                             else if(barnyard.getBarnyard().get(a).gitHealth() == 0)
                             {
                                 barnyard.getBarnyard().remove(barnyard.getBarnyard().get(a));
                                 breakNumber = 1;
                                 System.out.println("Interact with another animal?");
                                 int again = interact.nextInt();
                                 System.out.println("1: Yes");
                                 System.out.println("2: No");
                                 while(breakN != 1)
                                 {
                                     switch (again) {
                                         case 1:  interactAnimal();
                                             break;
                                         case 2:  System.out.println("Canceled");
                                                  breakN = 1;
                                             break;
                                         default: System.out.println("(Invalid Command)");
                                     }
                                 }
                             }
                             else
                             {
                                 try
                                 {
                                     Thread.sleep(1600);
                                 }
                                 catch(InterruptedException e)
                                 { 
                                     System.out.println(e);
                                 }
                                 System.out.println("What do you want to do next to " + barnyard.getBarnyard().get(a).gitName() + "?");
                             }
                        break;
                    case 6:  barnyard.getBarnyard().get(a).allAtributes();
                             try
                             {
                                 Thread.sleep(1600);
                             }
                             catch(InterruptedException e)
                             { 
                                 System.out.println(e);
                             }
                             System.out.println("What do you want to do next to " + barnyard.getBarnyard().get(a).gitName() + "?");
                        break;
                    default: System.out.println("(Invalid command.)");
                        break;
                }
            }
        }
    }
}