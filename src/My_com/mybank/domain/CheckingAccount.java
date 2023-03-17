package My_com.mybank.domain;

public class CheckingAccount extends Account{

    private double overdraftAmount = 0;

    public CheckingAccount(double initBalance, double overdraftAmount) {
        super(initBalance);
        this.overdraftAmount = overdraftAmount;
    }
    public CheckingAccount(double initBalance) {
        this(initBalance, 0.0);
    }
    public CheckingAccount(String name) {
        super(name);
    }
    public boolean withdraw(double amount) {
        boolean result = true;

        if (balance < amount ) {
            double overdraftNeeded = amount - balance;
            if (overdraftAmount < overdraftNeeded) {
                result = false;
            } else {
                balance = 0.0;
                overdraftAmount -= overdraftNeeded;
            }
        } else {
            balance = balance - amount;
        }
        return result;
    }
}
