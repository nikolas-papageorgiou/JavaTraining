package org.example;

public class Main {
    public static void main(String[] args) {

        DataSet dataSet = new DataSet();

        BankAccount BA1 = new BankAccount(1500);
        BankAccount BA2 = new BankAccount(2000);
        BankAccount BA3 = new BankAccount(1000);

        dataSet.add(BA1);
        dataSet.add(BA2);
        dataSet.add(BA3);
        System.out.println("Αverage: "+dataSet.calcAverage());
        System.out.println("Max Balance: "+dataSet.getMax().getMeasure());
        System.out.println("Min Balance: "+dataSet.getMin().getMeasure());

        Student S1 = new Student("Νikos",5.67);
        Student S2 = new Student("Takis",5.67);
        Student S3 = new Student("Makis",5.67);

        System.out.println("Αverage: "+dataSet.calcAverage());
        System.out.println("Max Balance: "+dataSet.getMax().getMeasure());
        System.out.println("Min Balance: "+dataSet.getMin().getMeasure());
    }
}