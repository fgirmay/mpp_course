package problem4;

/**
 * Created by fissehaye on 6/28/18.
 */
public final class Paycheck {

    private final double grossPay;
    private final double fica;
    private final double state;
    private final double local;
    private final double medicare;
    private final double socialSecurity;


    public Paycheck(double grossPay) {
        this.grossPay = grossPay;
        this.fica = 0.23;
        this.state = 0.05;
        this.local = 0.01;
        this.medicare = 0.03;
        this.socialSecurity = 0.075;
    }

    public void print() {
        System.out.println("The net pay is " + getNetPay());
    }

    public double getNetPay(){
        double deductible = getGrossPay() * (getFica() + getState() + getLocal() + getMedicare() + getSocialSecurity());
        return getGrossPay() - deductible;
    }


    public double getGrossPay() {
        return grossPay;
    }

    public double getFica() {
        return fica;
    }

    public double getState() {
        return state;
    }

    public double getLocal() {
        return local;
    }

    public double getMedicare() {
        return medicare;
    }

    public double getSocialSecurity() {
        return socialSecurity;
    }
}
