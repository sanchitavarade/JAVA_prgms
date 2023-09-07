public class QualifyingRacers 
{
    public static void main(String[] args)
    {
        
        System.out.println("Speeds of the racers:");
        double racer1Speed = 45;
        double racer2Speed = 44.25;
        double racer3Speed = 48.65;
        double racer4Speed = 44.5;
        double racer5Speed = 47.25;

        double totalspeed = racer1Speed + racer2Speed + racer3Speed + racer4Speed + racer5Speed;
        double averagespeed = totalspeed/5;

        if (racer1Speed > averagespeed)
        {
            System.out.println("Qualified racer : racer1");
        }
        else if (racer2Speed > averagespeed) 
        {
            System.out.println("Qualified racer : racer2" );
        }       
        else if (racer3Speed > averagespeed) 
        {
        System.out.println("Qualified racer : racer3");
        }
        else if (racer4Speed > averagespeed)
        {
        System.out.println("Qualified racer : racer4");
        }

        else
        {
        System.out.println("Qualified racer : racer5"); 
        }
    }
}
        
            
