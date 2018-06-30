package optional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fissehaye on 6/29/18.
 */
public class Employee {

    private String name;
    private List<Account> accounts = new ArrayList<>();

    public Employee(String name) {
        this.name = name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public double computeUpdatedBalanceSum() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
