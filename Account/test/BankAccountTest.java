import BankingSystem.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    public void setUp(){
        account = new BankAccount("Elijah Miracle", "1234", "1001");
    }

    @Test
    public void createAccount(){
        account = new BankAccount("Elijah Miracle", "1234", "1001");
        assertEquals("Elijah Miracle", account.getAccountName());
    }

    @Test
    public void deposit200AndGetBalanceOf200(){
        account.deposit(200);
        assertEquals(BigDecimal.valueOf(200), account.getBalance("1234"));
    }

    @Test
    public void deposit500_And_Deposit200ToGet700(){
        account.deposit(500);
        account.deposit(200);
        assertEquals(BigDecimal.valueOf(700), account.getBalance("1234"));
    }

    @Test
    public void depositANegativeValueAndGet0(){
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-50));
        assertEquals(BigDecimal.valueOf(0), account.getBalance("1234"));
    }

    @Test
    public void balanceIs50_And_IWithdraw50(){
        account.deposit(50);
        account.withdraw(50, "1234");
        assertEquals(BigDecimal.valueOf(0), account.getBalance("1234"));
    }

    @Test
    public void balanceIs500_And_IWithdraw200_And_BalanceIs300(){
        account.deposit(500);
        account.withdraw(200, "1234");
        assertEquals(BigDecimal.valueOf(300), account.getBalance("1234"));
    }

    @Test
    public void balanceIs500_And_IWithdraw10000(){
        account.deposit(500);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(10000, "1234"));
        assertEquals(BigDecimal.valueOf(500), account.getBalance("1234"));
    }

    @Test
    public void cannotWithdrawNegativeAmount(){
        account.deposit(500);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-200, "1234"));
        assertEquals(BigDecimal.valueOf(500), account.getBalance("1234"));
    }

    @Test
    public void iSetPinForBankAccountAndWithdrawUsingMyPin(){
        account.deposit(5000);
        account.withdraw(2000, "1234");
        assertEquals(BigDecimal.valueOf(3000), account.getBalance("1234"));
    }

    @Test
    public void getErrorForPuttingInTheWrongPin(){
        account.deposit(5000);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(1245, "3456"));
    }
}
