package april2017.prob2;

public class Admin {

    private Department[] depts;

    public Admin(Department[] depts) {
        this.depts = depts;
    }

	//implement
    public String hourlyCompanyMessage() {

        String result = "";
        for (Department department : depts) {
            result += format(department.getName(), department.nextMessage()) + "\n";
        }
        return result;
    }

    public String format(String name, String msg) {
        return name + ":" + msg;
    }
	
}
