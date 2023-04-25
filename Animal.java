import java.util.Scanner;

public class Animal
{
    Scanner scanner = new Scanner(System.in);
    
    public String type;
    public String name;
    public String gender;
    public int happiness;
    public int health;
    private DataWarehouse dataWarehouse;
    private Farmer farmer;
    
    public Animal()
    {
        type = dataWarehouse.randomType();
        gender = dataWarehouse.randomGender();
        if(gender == "male")
        {
            name = dataWarehouse.randomMaleName();
        }
        else if(gender == "female")
        {
            name = dataWarehouse.randomFemaleName();
        }
        happiness = Randomizer.nextInt(55, 95);
        health = 100;
    }
    
    public void getName()
    {
        System.out.println("The " + type + "'s name is " + name + ".");
    }
    
    public String gitName()
    {
        return name;
    }
    
    public void setName()
    {
        System.out.println("What would you like to rename " + name + "?");
        String name = scanner.nextLine();
        int r = Randomizer.nextInt(0, 2);
        if(r == 0)
        {
            System.out.println(this.name + " decided that name is terrible. Choose a different one.");
        }
        else
        {
            this.name = name;
            System.out.println("(Name set!)");
        }
    }
    
    public void getType()
    {
        System.out.println(name + " is a " + type + ".");
    }
    
    public String gitType()
    {
        return type;
    }
    
    public void setType()
    {
        System.out.println("What would you like to set " + name + "'s type to?");
        String type = scanner.nextLine();
        switch (type) {
                case "horse":  this.type = type;
                System.out.println("(" + name + " is now a " + type + "!)");
                         break;
                case "duck":  this.type = type;
                System.out.println("(" + name + " is now a " + type + "!)");
                         break;
                case "pig":  this.type = type;
                System.out.println("(" + name + " is now a " + type + "!)");
                         break;
                case "goat":  this.type = type;
                System.out.println("(" + name + " is now a " + type + "!)");
                         break;
                case "chicken":  this.type = type;
                System.out.println("(" + name + " is now a " + type + "!)");
                         break;
                case "cow":  this.type = type;
                System.out.println("(" + name + " is now a " + type + "!)");
                         break;
                case "rooster":  this.type = type;
                System.out.println("(" + name + " is now a " + type + "!)");
                         break;
                case "sheep":  this.type = type;
                System.out.println("(" + name + " is now a " + type + "!)");
                         break;
                default:  System.out.println("That is not a barnyard animal (in this game). [\"type\" must be lowercase]");
                         break;
            }
        this.type = type;
    }
    
    public void getGender()
    {
        System.out.println(name + " (" + type + ") is a " + gender + ".");
    }
    
    public String gitGender()
    {
        return gender;
    }
    
    public void setGender()
    {
        System.out.println("What would you like to change " + name + "'s gender to?");
        String gender = scanner.nextLine();
        int breakNumber = 0;
        switch (gender) {
                case "male":  this.gender = gender;
                System.out.println("(Gender set!)");
                         break;
                case "female":  this.gender = gender;
                System.out.println("(Gender set!)");
                         break;
                default:  System.out.println("That is not a gender. (\"Male\" or \"Female\" must be lowercase) Enter new gender");
                         break;
            }
    }
    
    public void getHappiness()
    {
         System.out.println(name + " (" + type + ") is " + happiness + "% happy.");
    }
    
    public int gitHappiness()
    {
        return happiness;
    }
    
    public void setHappiness()
    {
        System.out.println("What would you like to set " + name + "'s happiness percentage to?");
        int happiness = scanner.nextInt();
        int breakNumber = 0;
        while(breakNumber != 1)
        {
            if(happiness < 30)
            {
                System.out.println("(Animals cannot be \"set\" to happiness % below 30%, even if you are a god. Enter new value)");
                happiness = scanner.nextInt();
            }
            else if(happiness > 89)
            {
                System.out.println("(Animals cannot be \"set\" to happiness % to 90 or above, even if you are a god. Enter new value)");
                happiness = scanner.nextInt();
            }
            else
            {
                System.out.println("(Happiness Set!)");
                this.happiness = happiness;
                breakNumber = 1;
            }
        }
    }
    
    public void getHealth()
    {
        System.out.println(name + " (" + type + ") is at" + health + "% health.");
    }    
    
    public int gitHealth()
    {
        return health;
    }    
    
    public void setHealth()
    {
        System.out.println("What would you like to set " + name + "'s health to?");
        int health = scanner.nextInt();
        int breakNumber = 0;
        while(breakNumber != 1)
        {
            if(health < 30)
            {
                System.out.println("(Animals cannot be \"set\" to health % below 30%, even if you are a god. Enter new value)");
                health = scanner.nextInt();
            }
            else if(health > 89)
            {
                System.out.println("(Animals cannot be \"set\" to health % to 90 or above, even if you are a god. Enter new value)");
                health = scanner.nextInt();
            }
            else
            {
                System.out.println("(Health Set!)");
                this.health = health;
                breakNumber = 1;
            }
        }
    }    
    
    public void pet()
    {
        if(type.contains("mutant"))
        {
            System.out.println(name + " (" + type + ") kicked you. (-15 health)");
            farmer.health -= 15;
            
            if(farmer.health - 15 <= 0)
            {
                System.out.println("BOOM!");
                try
                {
                    Thread.sleep(500);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }    
                System.out.println("BAM!");
                try
                {
                    Thread.sleep(500);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }    
                System.out.println("POW!");
                try
                {
                    Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }    
                System.out.println("You died... You were crushed to a pulp by the " + type + "...");
            }
            farmer.health = 0;
        }
        else
        {
            if(happiness + 10 > 100)
            {
                happiness = 100;
                System.out.println(name + " (" + type + ") is 100% happy!");
            }
            else if(happiness < 31)
            {
                System.out.println("Love rejected: " + name + " doesn't like you right now.");
            }
            else
            {
                happiness += 10;
                System.out.println(name + " (" + type + ") is now +10% happier!");
            }
        }
    }
    
    public void feed()
    {
        Scanner foood = new Scanner(System.in);
        int r = Randomizer.nextInt(0, 3);
        System.out.println("What will you feed " + name + "?");
        String food = foood.nextLine();
        
        if(r == 0)
        {
            System.out.println("You fed " + name + " a(n) " + food + ". " + name + " enjoyed it.");
            if(happiness + 5 > 100)
            {
                happiness = 100;
                System.out.println(name + " (" + type + ") is now 100% happy!");
            }
            else
            {
                System.out.println("(+5% Happiness)");
                happiness += 5;
            }
        }
        else if(r == 1 || r == 2)
        {
            System.out.println("You fed " + name + " a(n) " + food + ". " + name + " disliked it but still ate it.");
        }
        else
        {
            System.out.println("You fed " + name + " a(n) " + food + ". " + name + " puked it and threw it at you.");
            System.out.println("(-5% Happiness)");
            happiness -= 5;
        }
    }
                
    public void kick()
    {
        int mutant = Randomizer.nextInt(0,14);
        int randHap = Randomizer.nextInt(10, 15);
        int randHea = Randomizer.nextInt(5, 10);
        if(type.contains("mutant"))
        {
            System.out.println(name + " kicked you back. ((you) -15% Health) [Your health: " + farmer.health + "/100");
            farmer.health -= 15;
        }
        else
        {
            if(happiness == 0)
            {
                System.out.println(name + " got mad and turned into a mutant " + type + ".");
                System.out.println("(100% Happiness)");
                type = "mutant " + type;
                happiness = 100;
                health = 100;
            }
            else
            {
                if(mutant == 14)
                {
                    System.out.println(name + " got mad and turned into a mutant " + type + ".");
                    System.out.println("(100% Happiness)");
                    type = "mutant " + type;
                    happiness = 100;
                    health = 100;
                }
                else
                {
                    if((health - randHea) <= 0)
                    {
                        System.out.println("You just killed " + name + "...");
                        try
                        {
                            Thread.sleep(1500);
                        }
                        catch(InterruptedException e)
                        {
                            System.out.println(e);
                        }
                        System.out.println("so cruel...");
                        health = 0;
                        try
                        {
                            Thread.sleep(1200);
                        }
                        catch(InterruptedException e)
                        {
                            System.out.println(e);
                        }
                    }
                    else if((happiness - randHap) <= 0)
                    {
                        happiness = 0;
                        System.out.println(name + " is now 0% happy... (How could you do this to " + name + "..?)");
                    }
                    else    
                    {
                        happiness -= randHap;
                        health -= randHea;
                        System.out.println(name + " (" + type + ") screamed in agony.");
                        System.out.println("-" + randHap + "% Happiness (" + happiness + "/100)");
                        System.out.println("-" + randHea + "% Health (" + health + "/100)");
                    }
                }
            }
        }    
    }
    
    public void listen()
    {
        if(type == "pig")
        {
            if(happiness > 85)
            {
                System.out.println("Oink! Oink!");
            }
            else
            {
                System.out.println("oink... ");
            }
        }
        else if(type == "cow")
        {
            if(happiness > 85)
            {
                System.out.println("Moooooooooo!");
            }
            else
            {
                System.out.println("moo...");
            }
        }
        else if(type == "sheep")
        {
            if(happiness > 85)
            {
                System.out.println("Baaaaaaaaaa!");
            }
            else
            {
                System.out.println("baa...");
            }
        }
        else if(type == "horse")
        {
            if(happiness > 85)
            {
                System.out.println("Neighh!");
            }
            else
            {
                System.out.println("neigh...");
            }
        }
        else if(type == "chicken")
        {
            if(happiness > 85)
            {
                System.out.println("Bawk! Bawk!");
            }
            else
            {
                System.out.println("ba-bawk...");
            }
        }
        else if(type == "rooster")
        {
            if(happiness > 85)
            {
                System.out.println("Cockadoodledoo!");
            }
            else
            {
                System.out.println("cockadoodledoo...");
            }
        }
        else if(type == "goat")
        {
            if(happiness > 85)
            {
                System.out.println("Baaaaaaaaaa!");
            }
            else
            {
                System.out.println("baa...");
            }
        }
        else if(type == "duck")
        {
            if(happiness > 85)
            {
                System.out.println("Quack! Quack!");
            }
            else
            {
                System.out.println("quack...");
            }
        }
        else
        {
            System.out.println("Animal sound unknown.");
        }    
    }
    
    public String allAtributesString()
    {
        return name + " is a " + gender + " " + type + " with " + happiness + "% happiness and " + health + "% health.";
    }    
    
    public void allAtributes()
    {
        System.out.println("Type: " + type + "\nName: " + name + "\nGender: " + gender + "\nHappiness: " + happiness + "%" + "\nHealth: " + health + "%");
    }
    }