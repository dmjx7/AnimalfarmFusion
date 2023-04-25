public class Achievements
{
    public static boolean workAchievement = false;
    public static boolean firstAnimal = false;
    public static boolean happyAnimal = false;
    public static boolean sadAnimal = false;
    public static boolean mutant = false;
    public static boolean sellAnimal = false;
    public static boolean jackpot = false;
    
    public static void achievementInfo()
    {
        if(workAchievement == true)
        {
            System.out.println("Put In the Work, Put In the Hours");
            System.out.println("     -Work for the first time.");
        }
        else
        {
            System.out.println("???");
        }    
        if(firstAnimal == true)
        {
            System.out.println("New Friend");
            System.out.println("     -Get an animal to 100% happiness.");
        }
        else
        {
            System.out.println("???");
        }
        if(happyAnimal == true)
        {
            System.out.println("Best Friends");
            System.out.println("     -Get an animal to 100% happiness.");
        }
        else
        {
            System.out.println("???");
        }
        if(sadAnimal == true)
        {
            System.out.println("Depression");
            System.out.println("     -Get an animal to 0% happiness.");
        }
        else
        {
            System.out.println("???");
        }
        if(mutant == true)
        {
            System.out.println("Teenage Mutant Ninja Turtles");
            System.out.println("     -Get mutant animal.");
        }
        else
        {
            System.out.println("???");
        }
        if(sellAnimal == true)
        {
            System.out.println("Bye Bye Animal, Hello Mulahh");
            System.out.println("     -Sell an animal for the first time.");
        }
        else
        {
            System.out.println("???");
        }
        if(jackpot == true)
        {
            System.out.println("Millionaire");
            System.out.println("     -Hit the jackpot when working.");
        }
        else
        {
            System.out.println("???");
        }
    }    
    
    
}