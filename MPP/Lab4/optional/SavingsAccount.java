package optional;

/**
 * Created by fissehaye on 6/29/18.
 */
public class SavingsAccount extends Account {

    private String accId;
    private double balance;
    private double interestRate;

    public SavingsAccount(String accId, double interestRate, double startBalance) {

        this.accId = accId;
        this.interestRate = interestRate;
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
        return balance + (interestRate * balance);
    }
}
