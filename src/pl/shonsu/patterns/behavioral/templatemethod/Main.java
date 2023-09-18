package pl.shonsu.patterns.behavioral.templatemethod;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BankOperation bankOperation = new DepositFounds(new BigDecimal("100"));
        bankOperation.executeOperation();
        bankOperation = new WithdrawFounds(new BigDecimal("50"));
        bankOperation.executeOperation();
    }
}
