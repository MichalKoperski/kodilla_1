package com.kodilla;

interface ATM2 {
    default void pleaseInsertCard() {
        System.out.println("Please insert card");
    }
    default void pleaseInsertPINCode() {
        System.out.println("Please insert PIN");
    }
    default void pleaseInsertSum() {
        System.out.println("Please insert sum you want to withdraw");
    }
    default void moneyWithdrawal() {
        System.out.println("Here is your money");
    }
    default void thanks() {
        System.out.println("Bye");
    }
    void run();
}
abstract class BankSide implements ATM2{
    protected void requestToWithdrawReceived() {
        System.out.println("Request to withdraw money has been received");
    }
    protected void checkingBankAccount() {
        System.out.println("Checking your bank account...");
    }
    protected void confirmationIfEnoughMoney() {
        System.out.println("You have got enough money!");
    }
    public void run() {
        this.pleaseInsertCard ();
        this.pleaseInsertPINCode ();
        this.pleaseInsertSum ();
        this.requestToWithdrawReceived ();
        this.checkingBankAccount();
        this.confirmationIfEnoughMoney();
        this.moneyWithdrawal();
        this.thanks();
    }
}
class ATMImplementation extends BankSide {
}
class ATMApplication {
    public static void main(String args[]) {
        ATM2 atm = new ATMImplementation();
        atm.run();
    }
}