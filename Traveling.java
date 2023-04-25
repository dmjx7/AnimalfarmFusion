public class Traveling
{
    private static AnimalFarm animalF;
    
    public static void travel(String x)
    {
        int r = Randomizer.nextInt(0, 4);
        System.out.println("*Going to " + x + "...*");
        
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
            Thread.sleep(1200);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println(".");
        try
        {
            Thread.sleep(1200);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println(".");
        try
        {
            Thread.sleep(1200);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        switch (r) {
            case 4:   question();
                break;
        }
    }    
    
    public static void question()
    {
        
    }    
}    