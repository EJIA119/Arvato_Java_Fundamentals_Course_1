public class BankAccount {

    private String id;
    private int balance = 0;

    public BankAccount() {

    }

    public BankAccount(String id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public BankAccount(String id) {

        this.id = id;
    }

    public String getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean deposit(int amt){
        return true;
    }

    public boolean withdrawal(int amt){
        return true;
    }
}
