package Application;

import Bank.Account;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Account account;

        System.out.println("Enter account ID: ");
        int accountId = sc.nextInt();

        System.out.println("Enter account owner: ");
        sc.nextLine();
        String accountOwner = sc.nextLine();

        System.out.println("Is there an initial deposit? (y/n): ");
        char answer = sc.next().charAt(0);

        if(answer == 'y') {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();

            account = new Account(accountId, accountOwner, initialDeposit);
        } else {
            account = new Account(accountId, accountOwner);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        System.out.println();
        double depositValue = sc.nextDouble();
        account.makeDeposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        System.out.println();
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        sc.close();
    }
}
