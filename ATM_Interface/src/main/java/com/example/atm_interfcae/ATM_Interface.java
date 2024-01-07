package com.example.atm_interfcae;

public interface ATM_Interface {
    void deposit(UserBankAccount userBankAccount);

    void withdraw(UserBankAccount userBankAccount);

    void checkBalance(UserBankAccount userBankAccount);
}
