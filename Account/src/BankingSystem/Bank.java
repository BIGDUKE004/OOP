package BankingSystem;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList <BankAccount> accounts = new ArrayList<>();
    private int accountNumber = 1001;

    public Bank(String BankName) {
    this.bankName = BankName;
    }

    public void registerAccount(String firstName, String lastName, String pin) {
        String name = firstName + " " + lastName;
        String number = this.accountNumber + "";
        BankAccount bankAccount = new BankAccount(name, pin, number);
        accounts.add(bankAccount);
        accountNumber++;
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

