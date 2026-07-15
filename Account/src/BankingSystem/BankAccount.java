package BankingSystem;
import BankingSystem.exceptions.InsufficientFundException;
import BankingSystem.exceptions.InvalidAmountException;
import BankingSystem.exceptions.InvalidPinException;

import java.math.BigDecimal;
public class BankAccount {
    private String accountName;
    private String accountNumber;
    private BigDecimal balance ;
    private String pin;

    public BankAccount(String accountName, String pin, String userAccountNumber) {
        this.pin = pin;
        this.accountName = accountName;
        this.balance = BigDecimal.valueOf(0);
        this.accountNumber = userAccountNumber;
    }

    public String getAccountName() {
        return accountName;
    }


    public String getAccountNumber() {
        return accountNumber;
    }


    public void deposit(int amount){
        getDeposit(amount);
    }


    private void getDeposit(int depositMoney){
        if(depositMoney <= 0){
            throw new InvalidAmountException("Invalid Amount");
        } else {
            BigDecimal amount = BigDecimal.valueOf(depositMoney);
            this.balance = this.balance.add(amount);

        }
    }


    public BigDecimal getBalance(String pin){
        if(!this.pin.equals(pin)){
            throw new InvalidPinException("Invalid Pin");
        }
        return balance;
    }


    public void withdraw(int withdrawMoney, String pin) {
            getWithdrawal(withdrawMoney, pin);
    }


    private void getWithdrawal(int amount, String pin){
            if (!this.pin.equals(pin)) {
                throw new InvalidPinException("Invalid PIN");
            }
            if (amount <= 0) {
                throw new InvalidAmountException("Invalid Amount");
            }
            if (BigDecimal.valueOf(amount).compareTo(balance) > 0){
                throw new InsufficientFundException("Insufficient funds");
            }
            BigDecimal value = BigDecimal.valueOf(amount);
            this.balance = this.balance.subtract(value);

    }




}