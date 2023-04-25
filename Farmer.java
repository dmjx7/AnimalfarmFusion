public class Farmer
{
    public DataWarehouse dataW;
    public static int age;
    public static int heightCm;
    public static int weightLbs;
    public static int money;
    public static int health;
    
    public Farmer()
    {
        this.age = Randomizer.nextInt(20, 45);
        this.heightCm = Randomizer.nextInt(175, 190);
        this.weightLbs = Randomizer.nextInt(120, 180);
    }    
    
    public static void getAge()
    {
        System.out.println("You are " + age + " years old.");
    }    
    
    public int gitAge()
    {
        return age;
    }    
    
    public static void getHeight()
    {
        System.out.println("You are " + heightCm + " centimeters tall.");
    }    
    
    public int gitHeight()
    {
        return heightCm;
    }   
    
    public static void getWeight()
    {
        System.out.println("You are " + weightLbs + "llbs.");
    }    
    
    public int gitWeight()
    {
        return weightLbs;
    }   
}