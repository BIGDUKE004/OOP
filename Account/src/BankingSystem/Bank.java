package BankingSystem;
import java.util.Random;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList <BankAccount> accounts = new ArrayList<>();
    private String accountNumber;

    public Bank(String BankName) {
    this.bankName = BankName;
    }

    public String generateAccountNumber(){
        String name = this.bankName;
        Random random = new Random();
        String serialNumber = String.format("%09d", random.nextInt(1_000_000_000));
        String bankDigit = getBankType();
        String incompleteNumber = bankDigit + serialNumber;
        int digit = completeAccountNumber(incompleteNumber);
        int lastDigit = (10 - digit) % 10;        String completedAccountNumber = incompleteNumber + lastDigit;
        return this.accountNumber = completedAccountNumber;
    }

    public int completeAccountNumber(String inCompleteNumber){
        int [] digit = new int[inCompleteNumber.length()];
        int [] multiplyingNumbers = {3, 7, 3, 3, 7, 3, 3, 7, 3, 3, 7, 3};
        for(int count = 0; count < inCompleteNumber.length(); count++){
            digit[count] = Character.getNumericValue(inCompleteNumber.charAt(count));
        }
        int total = getTheMultiplicationOfNumbers(multiplyingNumbers, digit);
        int finalAmount = total % 10;
        return finalAmount;
    }

    public int getTheMultiplicationOfNumbers(int [] multiplyingNumber, int [] digit){
        int total = 0;
        for(int counter = 0; counter < digit.length; counter++){
            total += digit[counter] * multiplyingNumber[counter];
        }
        return total;
    }

    public String getBankType(){
        bankName = this.bankName;
        String code = "";
        for(BankDigits bank : BankDigits.values()){
            if(bankName.equalsIgnoreCase(bank.getBankName())){
              code = bank.getCode();
            }
        }
        return code;
    }

    public String registerAccount(String firstName, String lastName, String pin) {
        String name = firstName + " " + lastName;
        BankAccount bankAccount = new BankAccount(name, pin, generateAccountNumber());
        accounts.add(bankAccount);
        return this.accountNumber;
    }


    public BankAccount getAccount(String getAccount) {
        for(BankAccount account : accounts){
            if(account.getAccountName().equals(getAccount)){
                return account;
            }
        }
        return null;
    }

    public int getSize() {
        return accounts.size();
    }

    public void deposit(int amount, String accountNumber) {
        for(BankAccount account : accounts){
            if(account.getAccountNumber().equals(accountNumber)){
                account.deposit(amount);
            }
        }
    }

    public BigDecimal checkBalance(String pin, String accountNumber) {
        for(BankAccount account : accounts){
            if(account.getAccountNumber().equals(accountNumber)){
                return account.getBalance(pin);
            }
        }
        return null;
    }

    public void withdraw(String accountNumber, int amount, String pin) {
        for(BankAccount account : accounts){
            if(account.getAccountNumber().equals(accountNumber)){
                account.withdraw(amount, pin);
            }
        }
    }

    public void transfer(String accountNumber, String secondUserAccountNumber, int amount, String pin) {
        boolean accountExists = false;
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(secondUserAccountNumber)) {
                accountExists = true;
            }
        }
        if (!accountExists) {
            throw new IllegalArgumentException("Account Does Not Exist");
        }

        for(BankAccount account : accounts){
            if(account.getAccountNumber().equals(accountNumber)){
                account.withdraw(amount, pin);
            }
        }
        for(BankAccount account : accounts){
            if(account.getAccountNumber().equals(secondUserAccountNumber)) {
                account.deposit(amount);
            }
        }
    }

    public void remove(String userAccount) {
        for(int count = 0; count < accounts.size(); count++){
            if(accounts.get(count).getAccountNumber().equals(userAccount)){
                accounts.remove(count);
            }
        }
    }
}

