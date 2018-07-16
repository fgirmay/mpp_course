package april2017.prob2;

public class Admin {
    //implement
    private Department[] depts;

    public Department[] getDep() {
        return depts;
    }

    public Admin(Department[] dep) {
        depts = dep;
    }

    public String hourlyCompanyMessage() {

        String message = "";

        for (Department department : depts) {
            message += format(department.getName(), department.nextMessage());
        }
        return message;
    }

    public String format(String name, String smg) {
        return String.format("%s : %s \n", name, smg);
    }
}
