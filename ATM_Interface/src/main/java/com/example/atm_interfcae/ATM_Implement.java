package com.example.atm_interfcae;

public class ATM_Implement implements ATM_Interface {

    @Override
    public void deposit(UserBankAccount userBankAccount) {
        double depositAmount = userBankAccount.getDepositAmount();
        if (depositAmount > 0) {
            userBankAccount.setBalance(userBankAccount.getBalance() + depositAmount);
            System.out.println("===========================");
            System.out.println("+ Deposit Successful !! +  ");
            System.out.println("===========================");

        }
    }

    @Override
    public void withdraw(UserBankAccount userBankAccount) {
        double withdrawAmount = userBankAccount.getWithdrawAmount();
        if (withdrawAmount < userBankAccount.getBalance() && withdrawAmount > 0) {
            userBankAccount.setBalance(userBankAccount.getBalance() - withdrawAmount);
            System.out.println("============================");
            System.out.println("+ Withdrawal Successful !!+ ");
            System.out.println("============================");
        } else {
            System.out.println("=========================");
            System.out.println("+ Insufficient Balance ! ");
            System.out.println("=========================");

        }

    }

    @Override
    public void checkBalance(UserBankAccount userBankAccount) {
        System.out.println("====================");
        System.out.println("+ Your balance is:  " + userBankAccount.getBalance());
        System.out.println("====================");
    }
}
