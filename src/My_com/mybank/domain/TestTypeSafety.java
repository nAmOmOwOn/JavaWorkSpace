package My_com.mybank.domain;

import My_com.mybank.domain.*;
import java.util.*;

public class TestTypeSafety {

    public static void main(String[] args) {
        List<CheckingAccount> lc = new ArrayList<CheckingAccount>();


        lc.add(new CheckingAccount("Fred"));
//        lc.add(new SavingsAccount("Fred")); // Compile error 남

        CheckingAccount ca = lc.get(0);
        System.out.println("Withdraw 150.00 : " + ca.withdraw(150.00));
        System.out.println("Deposit 22.50 : " + ca.deposit(22.50));
        System.out.println("Withdraw 47.62 : " + ca.withdraw(47.62));
        System.out.println("Withdraw 400.00 : " + ca.withdraw(400.00));
        System.out.println("Balance : " + ca.getBalance());
    }
}
