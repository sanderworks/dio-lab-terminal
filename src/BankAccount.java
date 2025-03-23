
public class BankAccount {
    
    private int number;
    private String branch;
    private String holder;
    private double balance;

    public BankAccount() {
        balance = 0;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String agency) {
        this.branch = agency;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
