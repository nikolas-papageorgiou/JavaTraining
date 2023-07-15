package org.example;

public class SavingAccount extends BankAccount{
    private double interestRate;

    public SavingAccount(double amount,double rate){
        super(amount);
        interestRate = rate;

    }
    public void setInterestRate(double rate) {
        interestRate = rate;
    }
    public void addInterest(){
        double interest = getBalance()*interestRate;
        deposit(interest);
    }

    @Override
    public void printData(){
        System.out.println("SavingAccount");
        System.out.println("Balance: "+balance+" rate: "+interestRate );
    }
}
