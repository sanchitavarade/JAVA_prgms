public class Realsolutions {
    public static void main(String[] args) {
        double a = 5;
        double b = 7;
        double c = 2;;

        double d = b * b - 4.0 * a * c;

        if (d>0)
        {
            double root1 = (-b + Math.pow(d , 0.5))/(2*a);  // formula to calculate roots
            double root2 = (-b - Math.pow(d, 0.5))/(2*a);
            System.out.println("Roots are : " +root1 + "and " +root2);
        }
        
        else if(d == 0)
        {
            double root1 = -b/2*a;
            System.out.println("Root is " +root1);
        }
        else
        {
            System.out.println("Roots are not real");
        }


    }

    
}
