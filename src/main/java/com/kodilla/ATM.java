package com.kodilla;

interface ATM {
    void wplata(int sumOfPayment);
    void wyplata(int sumOfWithdrawal);
    default void connectedWithBank() {
        System.out.println("Connected with bank");
    }
    static String getEndOfSession() {
        return "End of session, Goodbye";
    }
}
class ATMImpl implements ATM {
    public void wplata(int sumOfPayment) {
        System.out.println("You have entered " + sumOfPayment);
    }
    public void wyplata(int sumOfWithdrawal) {
        System.out.println("You have withdrawn " + sumOfWithdrawal);
    }
}
class Application2 {
    public static void main (String[] args) throws java.lang.Exception {
        int sumOfPayment = 1000;
        int sumOfWithdrawal=2000;

        ATMImpl atmimpl = new ATMImpl();
        atmimpl.wplata(sumOfPayment);
        atmimpl.wyplata(sumOfWithdrawal);
        atmimpl.connectedWithBank();
        System.out.println(ATM.getEndOfSession());
    }
}
