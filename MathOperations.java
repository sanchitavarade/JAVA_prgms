import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
        
            System.out.println("\nSelect an operation:");
            System.out.println("1. Calculate factorial");
            System.out.println("2. Test Armstrong number");
            System.out.println("3. Test Palindrome number");
            System.out.println("4. Test Prime number");
            System.out.println("5. Fibonacci series");
            System.out.println("6.Exit");
            System.out.print("Enter your choice : ");
            int choice = scanner.nextInt();

            System.out.println("Enter a number: ");
            int number = input.nextInt();

            switch (choice) {
                case 1:
                    double factorial = factorial(number);
                    System.out.println("Factorial of  is " + factorial);
                    break;
                case 2:
                   
                    if (testArmstrong(number)) {
                        System.out.println(+number +" is a Armstrong number");
                        
                    } else {
                        System.out.println(+number +" is not a Armstrong number");
                        
                    }
                    break;
                case 3: 
                    boolean isPalindrome = testPalindrome(number);
                    if (testPalindrome(number)) {
                        System.out.println(+number +" is a Palindrome number");
                        
                    } else {
                        System.out.println(+number +" is not a Palindrome number");
                    }
                    break;
                case 4:
                    boolean isPrime = testPrime(number);
                    if (testPrime(number)) {
                        System.out.println(+number +" is a Prime number");
                        
                    } else {
                        System.out.println(+number +" is not a Prime number");
                    }
                    break;
                case 5:
                    FibonacciSeries(number);
                    break;
                case 6:
                System.out.println("Exiting the program.");
                System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    // Method to calculate factorial of a number
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Method to test for Armstrong number
    public static boolean testArmstrong(int n) {
        int originalNumber = n;
        int sum = 0;
        int digits = (int) Math.log10(n) + 1;

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }

        return sum == originalNumber;
    }

    // Method to test for Palindrome number
    public static boolean testPalindrome(int n) {
        int originalNumber = n;
        int reversedNumber = 0;

        while (n > 0) {
            int digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
            n /= 10;
        }

        return reversedNumber == originalNumber;
    }

    // Method to test for Prime number
    public static boolean testPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Method to generate Fibonacci series
    public static void FibonacciSeries(int terms) {
        int first = 0 ;
        int second = 1;
        System.out.print("Fibonacci Series (first " + terms + " terms): ");
        for (int i = 0; i < terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
