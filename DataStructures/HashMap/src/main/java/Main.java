import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        BankAccount BA1 = new BankAccount("001",1000);
        BankAccount BA2 = new BankAccount("001",1000);

        HashSet<BankAccount> hashSet = new HashSet<BankAccount>();

        hashSet.add(BA1);
        hashSet.add(BA2);

        for(BankAccount account: hashSet){
            System.out.println(account.getCode()+","+account.getBalance());
        }

    }
}