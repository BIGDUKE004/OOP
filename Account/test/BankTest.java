import BankingSystem.Bank;
import BankingSystem.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    private Bank bank;
    @BeforeEach
    public void setBankName(){
        bank = new Bank("Elijah's Bank");
        bank.registerAccount("Elijah", "Miracle", "1234");
    }

    @Test
    public void registerAccount(){
        bank.registerAccount("Elijah", "Miracle", "1234");
        assertEquals(2, bank.getSize());
    }

    @Test
    public void findRegisteredAccount(){
        assertNotNull(bank.getAccount("Elijah Miracle"));
    }

    @Test
    public void iHaveAnAccountAndIDeposit_2000_IntoIt(){
        bank.deposit(2000, "1001");
        assertEquals(BigDecimal.valueOf(2000), bank.checkBalance("1234", "1001"));
    }

    @Test
    public void iHaveAnAccountAndIDepositANegativeNumber(){
        assertThrows(IllegalArgumentException.class, () -> bank.deposit(-50, "1001"));
    }

    @Test
    public void iHaveAnAccountWith_2000_AndIWithdraw_1000_AndHaveABalanceOf_1000(){
        bank.deposit(2000, "1001");
        assertEquals(BigDecimal.valueOf(2000), bank.checkBalance("1234", "1001"));
        bank.withdraw("1001", 1000, "1234");
        assertEquals(BigDecimal.valueOf(1000), bank.checkBalance("1234", "1001"));
    }

    @Test
    public void iHaveAnAccountWith200AndIWithdrawANegativeNumber(){
        bank.deposit(200, "1001");
        assertThrows(IllegalArgumentException.class, () -> bank.withdraw("1001", 1000, "1234"));
    }

    @Test
    public void iHaveAnAccountWith200AndIWithdraw1000(){
        bank.deposit(200, "1001");
        assertThrows(IllegalArgumentException.class, () -> bank.withdraw("1001", 1000, "1234"));
    }

    @Test
    public void IHave2000InMyAccountAndITransfer1500ToAnotherAccount(){
        bank.registerAccount("ashabi", "ashanty", "1234");
        assertEquals(2, bank.getSize());
        bank.deposit(2000, "1001");
        assertEquals(BigDecimal.valueOf(2000), bank.checkBalance("1234", "1001"));
        bank.transfer("1001", "1002", 1500, "1234");
        assertEquals(BigDecimal.valueOf(500), bank.checkBalance("1234", "1001"));
        assertEquals(BigDecimal.valueOf(1500), bank.checkBalance("1234", "1002"));
    }

    @Test
    public void iHaveAnAccountAndITransferToANonExistingAccount(){
        bank.deposit(1500, "1001");
        assertThrows(IllegalArgumentException.class, () -> bank.transfer("1001", "1002", 1500, "1234"));
    }

    @Test
    public void IThereAreTwoAccountAndOneIsDeleted(){
        bank.registerAccount("ashabi", "ashanty", "1234");
        assertEquals(2, bank.getSize());
        bank.remove("1002");
        assertEquals(1, bank.getSize());
    }
}
