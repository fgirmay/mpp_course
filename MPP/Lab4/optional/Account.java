package optional;

/**
 * Created by fissehaye on 6/29/18.
 */
public abstract class Account {

    Employee employee;

    public abstract String getAccountID();
    public abstract double getBalance();
    public abstract double computeUpdatedBalance();
}
