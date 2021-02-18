package com.itacademy.java.oop.basics.task3;

public class DebitCard extends Card {

    public DebitCard() {
    }

    public DebitCard(double balance, String cardHolderName, String cardName) {
        super(balance, cardHolderName, cardName);
    }

    @Override
    public void debit(double amount) throws NotEnoughBalanceException {
        if (balance - amount < 0) {
            throw new NotEnoughBalanceException("Insufficient funds.");
        } else {
            balance -= amount;
        }

    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "balance=" + balance +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", cardName='" + cardName + '\'' +
                '}';
    }
}
