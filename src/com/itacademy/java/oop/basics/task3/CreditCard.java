package com.itacademy.java.oop.basics.task3;

public class CreditCard extends Card{

    private double interest;
    private double credit;

    public CreditCard() {
    }

    public CreditCard(double balance, String cardHolderName, String cardName, double interest, double credit) {
        super(balance, cardHolderName, cardName);
        this.interest = interest;
        this.credit = credit;
    }

    public CreditCard(double interest, double credit) {
        this.interest = interest;
        this.credit = credit;
    }

    public double getInterest() {
        return interest;
    }

    public double getCredit() {
        return credit;
    }

    @Override
    public void debit(double amount) throws NotEnoughCreditException {
        if (balance - amount < credit) {
            throw new NotEnoughCreditException("This operation exceeds your credit limit.");
        } else {
            amount -= amount * interest;
            balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "balance=" + balance +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", cardName='" + cardName + '\'' +
                '}';
    }
}
