package com.itacademy.java.oop.basics.task3;

public abstract class Card {

    double balance;
    String cardHolderName;
    String cardName;

    public Card() {
    }

    public Card(double balance, String cardHolderName, String cardName) {
        this.balance = balance;
        this.cardHolderName = cardHolderName;
        this.cardName = cardName;
    }

    public double getBalance() {
        return balance;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getCardName() {
        return cardName;
    }

    public void credit(double amount) {
        balance += amount;

    }

    public abstract void debit(double amount) throws Exception;
}
