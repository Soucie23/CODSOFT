package com.example.atm_interfcae;

import java.util.Scanner;

public class ATM_Machine {
    public static void main(String[] args) {
        UserBankAccount userBankAccount = new UserBankAccount();
        ATM_Implement atmImplement = new ATM_Implement();

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("========================");
        System.out.println("+      ATM Machine     +");
        System.out.println("========================");

        int id = 2024;
        String password = "pass@2024";
        System.out.print("Enter the id: ");
        int entered_id = scanner.nextInt();

        System.out.print("Enter the password: ");
        String entered_password = scanner1.nextLine();

        if (entered_id == id && entered_password.equals(password)) {
            System.out.println("=============================");
            System.out.println("+ Authentication Successful +");
            System.out.println("=============================");

            boolean exit = false;
            while (!exit) {

                System.out.println("1. Check balance");
                System.out.println("2. Withdraw balance");
                System.out.println("3. Deposit balance");
                System.out.println("4. Exit");
                Scanner sc = new Scanner(System.in);
                System.out.print("Please enter your choice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        atmImplement.checkBalance(userBankAccount);
                        break;
                    case 2:
                        Scanner scanner3 = new Scanner(System.in);
                        System.out.print("Enter the amount to withdraw: ");
                        double withdrawAmount = scanner3.nextDouble();
                        userBankAccount.setWithdrawAmount(withdrawAmount);
                        atmImplement.withdraw(userBankAccount);
                        break;
                    case 3:
                        Scanner scanner2 = new Scanner(System.in);
                        System.out.print("Enter the amount to deposit: ");
                        double depositAmount = scanner2.nextDouble();
                        userBankAccount.setDepositAmount(depositAmount);
                        atmImplement.deposit(userBankAccount);
                        break;
                    case 4:
                        exit = true;
                        break;
                    default:
                        System.out.println("Please enter the valid choice");
                        break;
                }
            }
        } else {
            System.out.println("Error ! PLease enter correct id and password.");
        }
    }
}
