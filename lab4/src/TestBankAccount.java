import javax.swing.plaf.synth.SynthTextAreaUI;

public class TestBankAccount {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        System.out.println(b1.balance);
        b1.deposit(100);
        System.out.println(b1.balance);
        b1.withdraw(200);
        System.out.println(b1.balance);
    }
}

class BankAccount{
    double balance;

    void deposit(double amount){
        balance += amount;
    }

    void withdraw(double amount){
        balance -= amount;
        if (balance < 0){
            balance = 0;
        }
    }

}
