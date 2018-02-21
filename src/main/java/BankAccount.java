import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public final class BankAccount {

    /**
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         * checking.
         */
        CHECKINGS,
        /**
         * saving.
         */
        SAVINGS,
        /**
         * student.
         */
        STUDENT,
        /**
         * workplace.
         */
        WORKPLACE
    }

    /**
     * account number.
     */
    private int accountNumber;
    /**
     * account type.
     */
    private BankAccountType accountType;
    /**
     * accountBalance.
     */
    private double accountBalance;
    /**
     * owner name.
     */
    private String ownerName;
    /**
     * interestRate.
     */
    private double interestRate;
    /**
     * earned.
     */
    private double interestEarned;

    /**
     * @param name name
     * @param accountCategory category
     */
    private BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}