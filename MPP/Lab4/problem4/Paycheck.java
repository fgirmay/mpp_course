package problem4;

import java.util.Stack;

/**
 * Created by fissehaye on 6/28/18.
 */
public final class Paycheck {

    private double grossPay;
    private double fica;
    private double state;
    private double local;
    private double medicare;
    private double socialSecurity;


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
        double deductible = grossPay * (fica + state + local + medicare + socialSecurity);
        return grossPay - deductible;
    }
}
