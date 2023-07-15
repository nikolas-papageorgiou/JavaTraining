package org.example;

import java.lang.reflect.AccessibleObject;

public class Main {
    public static void main(String[] args) {
      BankAccount BA = new BankAccount(1000);
      SavingAccount SA = new SavingAccount(1000,0.02);
      CheckingAccount CA = new CheckingAccount(500);

      Bank bank = new Bank();

      bank.addAccount(BA);
      bank.addAccount(SA);
      bank.addAccount(CA);
      bank.printAllData();
    }
}