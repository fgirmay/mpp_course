package march2017.prob2;

public class SavingsAccount extends Account {

    private String acctId;
    private double interstRate;
    private double balance;

    public SavingsAccount(String acctId, double interstRate, double balance) {
        this.acctId = acctId;
        this.interstRate = interstRate;
        this.balance = balance;
    }


    @Override
    public String getAccountID() {
        return acctId;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double computeUpdatedBalance() {

        return balance + (interstRate * balance);
    }
}
