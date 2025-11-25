package bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String lastName = scanner.next();
        int accountBalance = scanner.nextInt();

        BankAccount bankAccountEmpty = new BankAccount();
        System.out.println(bankAccountEmpty.getFullName());
        System.out.println(bankAccountEmpty.getAccountBalance());

        BankAccount bankAccountName = new BankAccount(firstName, lastName);
        System.out.println(bankAccountName.getFullName());
        System.out.println(bankAccountName.getAccountBalance());

        BankAccount bankAccountBalance = new BankAccount(accountBalance);
        System.out.println(bankAccountBalance.getFullName());
        System.out.println(bankAccountBalance.getAccountBalance());

        BankAccount bankAccountFull = new BankAccount(firstName, lastName, accountBalance);
        System.out.println(bankAccountFull.getFullName());
        System.out.println(bankAccountFull.getAccountBalance());
    }
}
