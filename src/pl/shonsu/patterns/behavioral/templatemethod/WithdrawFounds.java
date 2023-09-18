package pl.shonsu.patterns.behavioral.templatemethod;

import java.math.BigDecimal;

public class WithdrawFounds extends BankOperation{
    private final BigDecimal foundsToWithdraw;

    public WithdrawFounds(BigDecimal foundsToWithdraw) {
        this.foundsToWithdraw = foundsToWithdraw;
    }

    @Override
    protected void performOperation() {
        logger.info(String.format("Withdraw %s from the account", foundsToWithdraw));
    }
}
