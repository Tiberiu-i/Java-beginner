package bank;

public class BankAccount {
    private String firstName;
    private String lastName;
    private int accountBalance;

    private static String bankSWIFT;

    public BankAccount(String firstName, String lastName, int accountBalance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountBalance = accountBalance;
    }

    public BankAccount(String firstName, String lastName) {
        this(firstName, lastName, 0);
    }

    public BankAccount(int accountBalance) {
        this("UNKNOWN_FIRST_NAME", "UNKNOWN_LAST_NAME", accountBalance);
    }

    public BankAccount() {
        this("UNKNOWN_FIRST_NAME", "UNKNOWN_LAST_NAME", 0);
    }

    public int getAccountBalance() {
        return this.accountBalance;
    }

    public void initializeBankAccount (String personFirstName, String personLastName,
                                       int initialAccountBalance) {
        firstName = personFirstName;
        lastName = personLastName;
        accountBalance = initialAccountBalance;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setFullName(String personFirstName, String personLastName) {
        firstName = personFirstName;
        lastName = personLastName;
    }

    public boolean debitAccount(int amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            return true;
        }
        return false;
    }

    public void creditAccount(int amount) {
        accountBalance += amount;
    }

    protected void adminBlockAccount() {
        accountBalance = -1;
    }

    public static String getBankSWIFT() {
        return bankSWIFT;
    }

    public static void setBankSWIFT(String newBankSWIFT) {
        bankSWIFT = newBankSWIFT;
    }
}