package Prod;

import BL.Account;
import BL.UsrModel;
import java.util.Random;

public class AccProd implements Runnable {

    private Account account;
    private UsrModel bl;

    public AccProd(Account account, UsrModel bl) {
        this.account = account;
        this.bl = bl;
    }

    @Override
    public void run() {

        Random rand = new Random();
        double money = 10 + (40) * rand.nextDouble();

        synchronized (account) {
            account.deposit(money);
            bl.inform(account, Thread.currentThread().getName() + " deposited: " + String.format("%.2f", money)+"€");
            account.notifyAll();
        }
    }

}
