public class DataWarehouse
{
    public static String randomType()
    {
        int r = Randomizer.nextInt(0, 7);
        String animalType = "";
        
        switch (r) 
        {
            case 0: animalType = "pig";
                break;
            case 1: animalType = "cow";
                break;
            case 2: animalType = "sheep";
                break;
            case 3: animalType = "horse";
                break;
            case 4: animalType = "chicken";
                break;
            case 5: animalType = "rooster";
                break;
            case 6: animalType = "goat";
                break;
            case 7: animalType = "duck";
                break;
        }
        
        return animalType;
    }
    
    public static String randomMaleName()
    {
        int r = Randomizer.nextInt(0, 7);
        String animalName = "";
        
        switch (r) 
        {
            case 0: animalName = "Diondre";
                break;
            case 1: animalName = "Camden";
                break;
            case 2: animalName = "Jovin";
                break;
            case 3: animalName = "Damien";
                break;
            case 4: animalName = "Michael";
                break;
            case 5: animalName = "John";
                break;
            case 6: animalName = "Devonte";
                break;
            case 7: animalName = "Patrick";
                break;
            case 8: animalName = "Gabriel";
                break;
        }
        
        return animalName;
    }
    
    public static String randomFemaleName()
    {
        int r = Randomizer.nextInt(0, 7);
        String animalName = "";
        
        switch (r) 
        {
            case 0: animalName = "Anna";
                break;
            case 1: animalName = "Anias";
                break;
            case 2: animalName = "Jamie";
                break;
            case 3: animalName = "Gabby";
                break;
            case 4: animalName = "Alexandra";
                break;
            case 5: animalName = "Faith";
                break;
            case 6: animalName = "Emma";
                break;
            case 7: animalName = "Riley";
                break;
        }
        
        return animalName;
    }
    
    public static String randomGender()
    {
        int r = Randomizer.nextInt(0, 1);
        String animalGender = "";
        
        switch (r) 
        {
            case 0: animalGender = "male";
                break;
            case 1: animalGender = "female";
                break;
        }
        
        return animalGender;
    }  
} 