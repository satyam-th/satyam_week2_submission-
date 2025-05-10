import java.util.Scanner;

class AccountHolder {
    String name;
    int accountNumber;
    double balance;

    public AccountHolder(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
            return;
        }
        balance += amount;
        System.out.println("Deposit successful! New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! New balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void display() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class mnumber2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        AccountHolder aashish = new AccountHolder("Aashish Smart", 123456, 1000.0);
        AccountHolder sandesh = new AccountHolder("Sandesh Hiro", 654321, 2000.0);
        AccountHolder saumya = new AccountHolder("Saumya Sir", 789012, 0.0);

        AccountHolder selectedAccount = null;

        while (selectedAccount == null) {
            System.out.println("Welcome to the Bank Account Management System!");
            System.out.println("Please select an account to manage:");
            System.out.println("1. Aashish Smart (Account Number: 123456)");
            System.out.println("2. Sandesh Hiro (Account Number: 654321)");
            System.out.println("3. Saumya Sir (Account Number: 789012)");
            System.out.print("Enter your choice: ");
            int accountChoice = scan.nextInt();

            switch (accountChoice) {
                case 1:
                    selectedAccount = aashish;
                    break;
                case 2:
                    selectedAccount = sandesh;
                    break;
                case 3:
                    selectedAccount = saumya;
                    break;
                default:
                    System.out.println("Invalid account choice. Please try again.\n");
            }
        }

        int choice = 0;
        while (choice != 4) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scan.nextDouble();
                    selectedAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scan.nextDouble();
                    selectedAccount.withdraw(withdrawAmount);
                    break;
                case 3:
                    selectedAccount.display();
                    break;
                case 4:
                    System.out.println("Exiting the system. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scan.close();
    }
}
