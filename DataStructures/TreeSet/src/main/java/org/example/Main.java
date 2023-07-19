package org.example;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        BankAccount BA1 = new BankAccount("001", 1500, "Nikos");
        BankAccount BA2 = new BankAccount("002", 900, "Babis");
        BankAccount BA3 = new BankAccount("003", 600, "Takis");

        Collection<BankAccount> treeset = new TreeSet<BankAccount>(new AccountNameComparator());


        treeset.add(BA1);
        treeset.add(BA2);
        treeset.add(BA3);


        //Η δομή δεδομένων treeset αποθηκεύει κατά αύξουσα σειρά τα δεδομένα
        for (BankAccount bankAccount : treeset) {
            System.out.println(bankAccount.getCode() + ","
                    + bankAccount.getHolderName() + "," +
                    bankAccount.getBalance());
        }
    }



}
class BankAccount {  // implements Comparable {
    private String code;
    private double balance;
    private String holderName;

    public BankAccount(String code, double balance, String name) {
        this.code = code;
        this.balance = balance;
        this.holderName = name;
    }

    //H compareTo είναι μια μέθοδος την οποία πρέπει να επαναορίσω ώστε
    //να ορίσω βάσει ποιας ιδιότητας θα γίνεται η σύγκριση και
    //Αν η έξοδος είναι 1 αυτό σημαίνει ότι το αντικείμενο μου έχει μεγαλύτερη τιμή
    //Αν εξόδος είναι -1 αυτό σημαίνει ότι το αντικείμενο μου έχει μικρότερη τιμή
    //Αν η έξοδος είναι 0 οι συγκρινόμενες ιδιότητες είναι ίσες
//    @Override
//    public int compareTo(Object o) {
//        BankAccount otherAccount = (BankAccount)o;
//        if(balance < otherAccount.getBalance())
//            return -1;
//        else if (balance > otherAccount.balance) {
//            return 1;
//        }else return 0;
//    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }


}
class AccountCodeComparator implements Comparator<BankAccount> {
    public int compare(BankAccount account1, BankAccount account2) {
        String code1 = account1.getCode();
        String code2 = account2.getCode();
        return code1.compareTo(code2);
    }
}

    class AccountNameComparator implements Comparator<BankAccount> {
public int compare(BankAccount account1, BankAccount account2) {
        String name1 = account1.getHolderName();
        String name2 = account2.getHolderName();
        return name1.compareTo(name2);
        }
        }