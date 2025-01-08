package p1;
import java.util.Scanner;

class BankAccount {
 private double balance;

 public BankAccount(double initialBalance) {
     balance = initialBalance;
 }
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposit successful. Current balance: $" + balance);
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawal successful. Current balance: $" + balance);
     } else if (amount > balance) {
         System.out.println("Insufficient balance.");
     } else {
         System.out.println("Invalid withdrawal amount.");
     }
 }

 public double checkBalance() {
     return balance;
 }
}

//ATM class to represent the ATM machine and interact with the user
class ATM {
 private BankAccount bankAccount;

 public ATM(BankAccount account) {
     this.bankAccount = account;
 }

 // Method to display the ATM menu
 public void displayMenu() {
     Scanner scanner = new Scanner(System.in);
     int option;
     
     do {
         System.out.println("\nWelcome to the XYZ ATM");
         System.out.println("1. Withdraw Amount");
         System.out.println("2. Deposit Amount");
         System.out.println("3. Check Balance");
         System.out.println("4. Exit Thank you !!!");
         System.out.print("Please select an option: ");
         option = scanner.nextInt();

         switch (option) {
             case 1:
                 System.out.print("Enter the amount to withdraw: $");
                 double withdrawAmount = scanner.nextDouble();
                 bankAccount.withdraw(withdrawAmount);
                 break;

             case 2:
                 System.out.print("Enter the amount to deposit: $");
                 double depositAmount = scanner.nextDouble();
                 bankAccount.deposit(depositAmount);
                 break;

             case 3:
                 System.out.println("Current balance: $" + bankAccount.checkBalance());
                 break;

             case 4:
                 System.out.println("Thank you for using the ATM. Goodbye!");
                 break;

             default:
                 System.out.println("Invalid option. Please try again.");
                 break;
         }
     } while (option != 4);
     
     scanner.close();
 }
}

public class AtmInterface {
 public static void main(String[] args) {

     BankAccount account = new BankAccount(1000);
     
     // Create an ATM instance and connect it to the user's bank account
     ATM atm = new ATM(account);
     
     // Display the ATM menu to the user
     atm.displayMenu();
 }
}
