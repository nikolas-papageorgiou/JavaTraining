public class BankAccount {
    private double balance;
    private String code;

    public BankAccount(String code, double balance){
        this.balance = balance;
        this.code = code;
    }
    public double getBalance() {
        return balance;
    }
    public String getCode(){
        return code;
    }

    @Override
    public int hashCode(){
        return code.hashCode();
    }
    @Override
    public boolean equals(Object other){
        BankAccount otherAccount = (BankAccount) other;
        return otherAccount.getCode().equals(this.getCode());
    }
}
