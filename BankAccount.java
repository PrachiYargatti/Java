package com.codsoft;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }
}

public class ATM {
    private Map<String, BankAccount> accounts;
    private Scanner scanner;

    public ATM() {
        accounts = new HashMap<>();
        scanner = new Scanner(System.in);

        accounts.put("12345", new BankAccount(1000.0));
        accounts.put("67890", new BankAccount(500.0));
    }

    public void run() {
        while (true) {
            System.out.print("Enter your account number: ");
            String accountNumber = scanner.nextLine();

            if (accounts.containsKey(accountNumber)) {
                BankAccount account = accounts.get(accountNumber);
                System.out.println("Welcome to the ATM!");

                while (true) {
                    System.out.println("\nATM Menu:");
                    System.out.println("1. Check Balance");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Deposit");
                    System.out.println("4. Logout");

                    System.out.print("Choose an option: ");
                    int option = scanner.nextInt();
                    scanner.nextLine();

                    switch (option) {
                        case 1:
                            System.out.printf("Your balance is: $%.2f\n", account.getBalance());
                            break;
                        case 2:
                            System.out.print("Enter amount to withdraw: ");
                            double withdrawAmount = scanner.nextDouble();
                            scanner.nextLine();

                            if (withdrawAmount > 0 && account.withdraw(withdrawAmount)) {
                                System.out.printf("Withdrawal successful. Your new balance is: $%.2f\n", account.getBalance());
                            } else if (withdrawAmount <= 0) {
                                System.out.println("Invalid withdrawal amount. Please enter a positive value.");
                            } else {
                                System.out.println("Insufficient balance.");
                            }
                            break;
                        case 3:
                            System.out.print("Enter amount to deposit: ");
                            double depositAmount = scanner.nextDouble();
                            scanner.nextLine();

                            if (depositAmount > 0) {
                                account.deposit(depositAmount);
                                System.out.printf("Deposit successful. Your new balance is: $%.2f\n", account.getBalance());
                            } else {
                                System.out.println("Invalid deposit amount. Please enter a positive value.");
                            }
                            break;
                        case 4:
                            System.out.println("Logging out...");
                            return;
                        default:
                            System.out.println("Invalid option. Please choose again.");
                    }
                }
            } else {
                System.out.println("Account not found. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.run();
    }
}
