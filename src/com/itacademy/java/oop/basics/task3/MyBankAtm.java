package com.itacademy.java.oop.basics.task3;

public class MyBankAtm implements Atm {

    private double atmBalance;

    public MyBankAtm() {
    }

    public MyBankAtm(double atmBalance) {
        this.atmBalance = atmBalance;
    }

    public double getAtmBalance() {
        return atmBalance;
    }

    @Override
    public void withdraw(CreditCard creditCard, double withdrawalAmount) throws InsufficientAtmFundsException {
        if (withdrawalAmount > getAtmBalance()) {
            throw new InsufficientAtmFundsException("Funds at ATM are insufficient. Please use another ATM.");
        } else {
            creditCard.credit(withdrawalAmount);
            atmBalance -= withdrawalAmount;
        }

    }

    @Override
    public void withdraw(DebitCard debitCard, double withdrawalAmount) throws InsufficientAtmFundsException {
        if (withdrawalAmount > getAtmBalance()) {
            throw new InsufficientAtmFundsException("Funds at ATM are insufficient. Please use another ATM.");
        } else {
            debitCard.credit(withdrawalAmount);
            atmBalance -= withdrawalAmount;
        }

    }

    @Override
    public String toString() {
        return "MyBankAtm{" +
                "atmBalance=" + atmBalance +
                '}';
    }
}
