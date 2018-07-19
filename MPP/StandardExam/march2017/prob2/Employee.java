package march2017.prob2;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private List<Account> accountList = new ArrayList<>();

    public Employee(String name) {
        this.name = name;
    }

    public double computeUpdatedBalanceSum() {
        //implement
        return 0.0;
    }

    public void addAccount(Account acct) {
        this.accountList.add(acct);
    }

    public String getName() {
        return name;
    }

    public List<Account> getAccountList() {
        return accountList;
    }
}
