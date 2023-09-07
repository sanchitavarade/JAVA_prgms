import java.util.Scanner;

class Bank_Accounts {
     String customerName;
     int accountNumber;
     double balance;
     double rateOfInterest;
     String contactNumber;
     String address;

    public void createAccount() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Customer Name:");
        customerName = input.nextLine();
        System.out.println("Enter Account Number:");
        accountNumber = input.nextInt();
        System.out.println("Enter Initial Balance:");
        balance = input.nextDouble();
        System.out.println("Enter Rate of Interest:");
        rateOfInterest = input.nextDouble();
        input.nextLine();  
        System.out.println("Enter Contact Number:");
        contactNumber = input.nextLine();
        System.out.println("Enter Address:");
        address = input.nextLine();
        System.out.println("Account created successfully!");
    }

    public void deposit() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount to deposit:");
        double amount = input.nextDouble();
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw:");
        double amount = input.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println(" New balance: " + balance);
        } else {
            System.out.println("Invalid withdraw");
        }
    }

    public void computeInterest() {
        double interest = (balance * rateOfInterest) / 100;
        balance =balance + interest;
        System.out.println(" New balance: " + balance);
    }

    public void displayBalance() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Address: " + address);
    }
}

public class Bank_Account{
    public static void main(String[] args) {
        Bank_Accounts account = new Bank_Accounts();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Compute Interest");
            System.out.println("5. Display Balance");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    account.createAccount();
                    break;
                case 2:
                    account.deposit();
                    break;
                case 3:
                    account.withdraw();
                    break;
                case 4:
                    account.computeInterest();
                    break;
                case 5:
                    account.displayBalance();
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
