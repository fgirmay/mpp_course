package optional;

import java.util.List;

/**
 * Created by fissehaye on 6/29/18.
 */
public class Admin {

    public static double computeUpdatedBalanceSum(List<Employee> employees) {

        double updatedBalanceSum = 0;

        for (Employee employee : employees) {

            for (Account account : employee.getAccounts()) {
                System.out.println("Account updated balance is " + account.computeUpdatedBalance());
                updatedBalanceSum += account.computeUpdatedBalance();
            }
        }
        return updatedBalanceSum;
    }
}
