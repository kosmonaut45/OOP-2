package com.itacademy.java.oop.basics.task3;

public interface Atm {

    public void withdraw(CreditCard creditCard, double withdrawalAmount) throws InsufficientAtmFundsException;
    public void withdraw(DebitCard debitCard, double withdrawalAmount) throws InsufficientAtmFundsException;

}
