package org.example;

public class CheckingAccount extends BankAccount{
    private int transactionsCounter;
    public CheckingAccount(double amount){
        super(amount);
        transactionsCounter = 0;
    }


    //Επανορισμός μεθόδου
    @Override
    public void deposit(double amount){
        transactionsCounter++;
        super.deposit(amount);
        if(transactionsCounter > 3){
            deductFees();
        }
    }

    public void deductFees(){
        balance-=0.5;
    }

    @Override
    public void printData(){
        System.out.println("CheckingAccount");
        System.out.println("Balance: "+balance+" free limit: 3" );
    }
}
