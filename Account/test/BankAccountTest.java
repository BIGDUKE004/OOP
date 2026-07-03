import Account.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    public void setUp(){
        account = new BankAccount();
    }

    @Test
    public void deposit200AndGetBalanceOf200(){
        account.deposit(200);
        assertEquals(200, account.getBalance());
    }

    @Test
    public void deposit500_And_Deposit200ToGet700(){
        account.deposit(500);
        account.deposit(200);
        assertEquals(700, account.getBalance());
    }

    @Test
    public void depositANegativeValueAndGet0(){
        account.deposit(-50);
        assertEquals(0, account.getBalance());
    }

    @Test
    public void balanceIs50_And_IWithdraw50(){
        account.setPin(1234);
        account.deposit(50);
        account.withdraw(50, 1234);
        assertEquals(0, account.getBalance());
    }

    @Test
    public void balanceIs500_And_IWithdraw200_And_BalanceIs300(){
        account.setPin(1234);
        account.deposit(500);
        account.withdraw(200, 1234);
        assertEquals(300, account.getBalance());
    }

    @Test
    public void balanceIs500_And_IWithdraw10000(){
        account.setPin(1234);
        account.deposit(500);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(10000, 1234));
        assertEquals(500, account.getBalance());
    }

    @Test
    public void cannotWithdrawNegativeAmount(){
        account.setPin(1234);
        account.deposit(500);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-200, 1234));
        assertEquals(500, account.getBalance());
    }

    @Test
    public void iSetPinForBankAccountAndWithdrawUsingMyPin(){
        account.setPin(1234);
        account.deposit(5000);
        account.withdraw(2000, 1234);
        assertEquals(3000, account.getBalance());
    }

    @Test
    public void getErrorForPuttingInTheWrongPin(){
        account.setPin(1234);
        account.deposit(5000);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(1245, 3456));
    }
}
