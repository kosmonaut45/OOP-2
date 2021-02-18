package com.itacademy.java.oop.basics.task3;

public class AtmApplication {
    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard(100, "John", "credit", 0.01, -100);
        DebitCard debitCard = new DebitCard(150, "Peter", "debit");
        MyBankAtm myBankAtm = new MyBankAtm(5020);


        try {
            myBankAtm.withdraw(creditCard, 510);
            myBankAtm.withdraw(debitCard, 2000);
            creditCard.debit(100);
            creditCard.debit(1000);
        } catch (InsufficientAtmFundsException | NotEnoughCreditException e) {
            System.out.println(e.getMessage());
        }

        try {
            myBankAtm.withdraw(creditCard, 500);
            myBankAtm.withdraw(debitCard, 2000);
            debitCard.debit(1000);
            debitCard.debit(10000);
        } catch (InsufficientAtmFundsException | NotEnoughBalanceException e) {
            System.out.println(e.getMessage());
        }

        try {
            myBankAtm.withdraw(creditCard, 498);
            myBankAtm.withdraw(debitCard, 2000);
        } catch (InsufficientAtmFundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            creditCard.debit(1200);
        } catch (NotEnoughCreditException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(creditCard.toString());
        System.out.println(debitCard.toString());
        System.out.println(myBankAtm.toString());
    }
}
