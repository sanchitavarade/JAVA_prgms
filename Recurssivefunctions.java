import java.util.Scanner;

public class Recurssivefunctions {

    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }

    public static int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }

    public static void FibonacciSeries(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int reverseNumber(int n) {
        return reversenumber(n, 0);
    }

    public static int reversenumber(int n, int reversed) {
        if (n == 0) {
            return reversed;
        } else {
            return reversenumber(n / 10, reversed * 10 + n % 10);
        }
    }

    public static int Sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + Sum(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("RECURSIVE FUNCTIONS:");
            System.out.println("1. GCD and LCM");
            System.out.println("2. Print Fibonacci Numbers");
            System.out.println("3. Reverse of a Number");
            System.out.println("4. Sum of numbers");
            System.out.println("5. Exit");

            System.out.print("Enter your choice from 1 to 5: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number1: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Enter number2: ");
                    int num2 = scanner.nextInt();
                    int gcd =  GCD(num1, num2);
                    int lcm =  LCM(num1, num2);
                    System.out.println("GCD: " + gcd);
                    System.out.println("LCM: " + lcm);
                    break;

                case 2:
                    System.out.print("Enter the number of Fibonacci numbers to print: ");
                    int n = scanner.nextInt();
                    FibonacciSeries(n);
                    break;

                case 3:
                    System.out.print("Enter a number to reverse: ");
                    int numtoReverse = scanner.nextInt();
                    int reversed = reverseNumber(numtoReverse);
                    System.out.println("Reversed Number: " + reversed);
                    break;

                case 4:
                    System.out.print("Enter the value of n: ");
                    int sumN = scanner.nextInt();
                    int sumResult = Sum(sumN);
                    System.out.println("Sum of 1+2+3+...n  " + sumN + " = " + sumResult);
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
