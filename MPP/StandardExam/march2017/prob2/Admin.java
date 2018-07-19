package march2017.prob2;

import java.util.List;

public class Admin {
    public static double computeUpdatedBalanceSum(List<Employee> list) {
        //implement

        double totalUpdatedBalance = 0;

        for (Employee employee : list) {
            for (Account account : employee.getAccountList()) {
                totalUpdatedBalance += account.computeUpdatedBalance();
            }
        }

        return totalUpdatedBalance;
    }
}
