package Bank;

public class Account {
    private int id;
    private String accountOwner;
    private double balance;

    public Account(int id, String accountOwner) {
        this.id = id;
        this.accountOwner = accountOwner;
    }

    public Account(int id, String accountOwner, double initialDeposit) {
        this.id = id;
        this.accountOwner = accountOwner;
        makeDeposit(initialDeposit);
    }

    public int getId() {
        return id;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public void makeDeposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount + 5.0;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountOwner='" + accountOwner + '\'' +
                ", balance=$" + balance +
                '}';
    }
}
