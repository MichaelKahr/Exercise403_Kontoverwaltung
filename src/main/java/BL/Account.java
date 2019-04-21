package BL;

public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double money) {
        balance += money;
    }

    public void withdraw(double money) throws NoMoneyException {
        if (money > balance) {
            throw new NoMoneyException();
        }
        balance -= money;
    }

    public void transferTo(Account sec, double money) throws NoMoneyException {
        withdraw(money);
        sec.deposit(money);
    }

    public double getBalance() {
        return balance;
    }
}
