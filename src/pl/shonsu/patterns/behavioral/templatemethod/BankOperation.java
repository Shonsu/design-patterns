package pl.shonsu.patterns.behavioral.templatemethod;


import java.util.logging.Logger;

public abstract class BankOperation {
    static final Logger logger = Logger.getLogger(BankOperation.class.getName());


    public void executeOperation(){
        login();
        validateAccount();
        performOperation();
        logTransaction();
    }

    private void login() {
        logger.info("Login into the bank system...");
    }

    private void validateAccount() {
        logger.info("Validate account credentials...");
    }

    protected abstract void performOperation();

    private void logTransaction() {
        logger.info("Log transaction details...");
    }

}
