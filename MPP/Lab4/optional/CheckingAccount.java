package optional;

/**
 * Created by fissehaye on 6/29/18.
 */
public class CheckingAccount extends Account {

    private String accId;
    private double balance;
    private double monthlyFee;

    public CheckingAccount(String accId, double fee, double startBalance) {

        this.accId = accId;
        this.monthlyFee = fee;
        this.balance = startBalance;
    }

    @Override
    public String getAccountID() {
        return accId;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double computeUpdatedBalance() {
        return balance - monthlyFee;
    }
}
