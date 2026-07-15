package BankingSystem;
import java.util.Scanner;

public class Atm {

        public static void main(String [] args) {
        Bank bank = new Bank("ZenithBank");
        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("""
                    1. Create account
                    2. Deposit money
                    3. Withdraw money
                    4. Transfer money
                    5. Check balance
                    6. Remove account
                    7. Find account
                    """);

            System.out.println("Enter option");
            int userInput = input.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println("Enter firstname");
                    String firstname = input.nextLine();
                    input.nextLine();

                    System.out.println("Enter Lastname");
                    String lastname = input.nextLine();
                    input.nextLine();

                    System.out.println("Enter pin");
                    String pin = input.nextLine();

                    String user = bank.registerAccount(firstname, lastname, pin);
                    System.out.println("successful");
                    System.out.println(user);
                    break;

                case 2:
                    System.out.println("Enter amount: ");
                    int amount = input.nextInt();
                    input.nextLine();

                    System.out.println("Enter account number: ");
                    String accountNumber = input.nextLine();

                    bank.deposit(amount, accountNumber);
                    System.out.println("successful");
                    break;

                case 3:
                    System.out.println("Enter amount: ");
                    int amountToWithdraw = input.nextInt();
                    input.nextLine();

                    System.out.println("Enter bank account: ");
                    String collectAccountNumber = input.nextLine();

                    System.out.println("Enter pin");
                    String userPin = input.nextLine();

                    bank.withdraw(collectAccountNumber, amountToWithdraw, userPin);
                    System.out.println("successful");
                    break;

                case 4:
                    System.out.println("Enter your account number: ");
                    String userAccount = input.nextLine();

                    System.out.println("Enter receiver account number: ");
                    String receiverAccountNumber = input.nextLine();

                    System.out.println("Enter amount: ");
                    int userAmount = input.nextInt();
                    input.nextLine();

                    System.out.println("Enter pin");
                    String sender = input.nextLine();

                    bank.transfer(userAccount, receiverAccountNumber, userAmount, sender);
                    System.out.println("successful");
                    break;

                case 5:
                    System.out.println("Enter pin: ");
                    String checkBalancePin = input.nextLine();
                    input.nextLine();

                    System.out.println("Enter accountNumber: ");
                    String accountNumberForCheckingBalance = input.nextLine();

                    System.out.println(
                            bank.checkBalance(checkBalancePin, accountNumberForCheckingBalance)
                    );
                    break;

                case 6:
                    System.out.println("Enter account number: ");
                    String removedAccount = input.nextLine();
                    bank.remove(removedAccount);
                    break;

                case 7:
                    System.out.print("Enter account name: ");
                    String accountName = input.nextLine();
                    System.out.println(
                            bank.getAccount(accountName)
                    );

                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}
