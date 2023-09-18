package pl.shonsu.patterns.behavioral.templatemethod;

import java.math.BigDecimal;

public class DepositFounds extends BankOperation{
    private final BigDecimal foundsToDeposit;

    public DepositFounds(BigDecimal foundsToDeposit) {
        this.foundsToDeposit = foundsToDeposit;
    }

    @Override
    protected void performOperation() {
        logger.info(String.format("Deposit %s to the account", foundsToDeposit));
    }
}
