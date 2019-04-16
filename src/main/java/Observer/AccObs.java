package Observer;
import BL.Account;

public interface AccObs {

    public void update(Account acc, String msg);
}
