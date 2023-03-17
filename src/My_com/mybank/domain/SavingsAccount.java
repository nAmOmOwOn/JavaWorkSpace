package My_com.mybank.domain;

public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(double initBalance, double interestRate) {
        super(initBalance);
        this.interestRate = interestRate;
    }

    public SavingsAccount(String name) {
        super(name);
        this.interestRate = 5.0;
    }
}
