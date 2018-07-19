package march2017.prob2;

public class CheckingAccount extends Account {

    private double balance;
    private double monthlyFee;
    private String acctId;

    public CheckingAccount(String acctId, double fee, double startBalance) {

        this.balance = startBalance;
        this.monthlyFee = fee;
        this.acctId = acctId;
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
        return balance - monthlyFee;
    }
}
