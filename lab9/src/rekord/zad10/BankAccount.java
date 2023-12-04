package rekord.zad10;

public record BankAccount(int number, double balance) {
    public BankAccount(int number){
        this(number, 0.0);
    }
}
