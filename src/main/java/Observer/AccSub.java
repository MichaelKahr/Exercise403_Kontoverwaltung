package Observer;
import BL.Account;

public interface AccSub {

    public void register(AccObs observer);

    public void deregister(AccObs observer);

    public void inform(Account acc, String message);
}
