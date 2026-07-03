package Account;

public class BankAccount {
    private int balance;
    private int pin;

    public void setPin(int userPin) {
        this.pin = userPin;
    }

    public void deposit(int amount){
        getDeposit(amount);
    }


    private void getDeposit(int depositMoney){
        boolean isNegative = depositMoney > 0;
        if(isNegative)balance = balance + depositMoney;
    }


    public int getBalance(){
        return balance;
    }


    public void withdraw(int withdrawMoney, int pin) {
            getWithdrawal(withdrawMoney, pin);
    }


    private void getWithdrawal(int amount, int pin){
            if (this.pin != pin) {
                throw new IllegalArgumentException("Invalid PIN");
            }
            if (amount <= 0) {
                throw new IllegalArgumentException("Invalid Amount");
            }
            if (amount > balance) {
                throw new IllegalArgumentException("Insufficient funds");
            }
            balance -= amount;

    }


}