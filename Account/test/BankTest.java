import BankingSystem.Bank;
import BankingSystem.BankAccount;
import BankingSystem.exceptions.InsufficientFundException;
import BankingSystem.exceptions.InvalidAmountException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    private Bank bank;
    @BeforeEach
    public void setBankName(){
        bank = new Bank("Elijah's Bank");
        String accountNumber = bank.registerAccount("Elijah", "Miracle", "1234");
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
        String accountNumber = bank.registerAccount("ashabi", "ashanty", "1234");
        bank.deposit(2000, accountNumber);
        assertEquals(BigDecimal.valueOf(2000), bank.checkBalance("1234", accountNumber));
    }

    @Test
    public void iHaveAnAccountAndIDepositANegativeNumber(){
        String accountNumber = bank.registerAccount("ashabi", "ashanty", "1234");
        assertThrows(InvalidAmountException.class, () -> bank.deposit(-50, accountNumber));
    }

    @Test
    public void iHaveAnAccountWith_2000_AndIWithdraw_1000_AndHaveABalanceOf_1000(){
        String accountNumber = bank.registerAccount("ashabi", "ashanty", "1234");
        bank.deposit(2000, accountNumber);
        assertEquals(BigDecimal.valueOf(2000), bank.checkBalance("1234", accountNumber));
        bank.withdraw(accountNumber, 1000, "1234");
        assertEquals(BigDecimal.valueOf(1000), bank.checkBalance("1234", accountNumber));
    }

    @Test
    public void iHaveAnAccountWith200AndIWithdrawANegativeNumber(){
        String accountNumber = bank.registerAccount("ashabi", "ashanty", "1234");
        bank.deposit(200, accountNumber);
        assertThrows(InsufficientFundException.class, () -> bank.withdraw(accountNumber, 1000, "1234"));
    }

    @Test
    public void iHaveAnAccountWith200AndIWithdraw1000(){
        String accountNumber = bank.registerAccount("ashabi", "ashanty", "1234");
        bank.deposit(200, accountNumber);
        assertThrows(InsufficientFundException.class, () -> bank.withdraw(accountNumber, 1000, "1234"));
    }

    @Test
    public void IHave2000InMyAccountAndITransfer1500ToAnotherAccount(){
        String accountNumber = bank.registerAccount("ashabi", "ashanty", "1234");
        assertEquals(2, bank.getSize());
        bank.deposit(2000, accountNumber);
        assertEquals(BigDecimal.valueOf(2000), bank.checkBalance("1234", accountNumber));
        String accountNumberTwo = bank.registerAccount("ashabi", "ashanty", "1234");
        bank.transfer(accountNumber, accountNumberTwo, 1500, "1234");
        assertEquals(BigDecimal.valueOf(500), bank.checkBalance("1234", accountNumber));
        assertEquals(BigDecimal.valueOf(1500), bank.checkBalance("1234", accountNumberTwo));
    }

    @Test
    public void iHaveAnAccountAndITransferToANonExistingAccount(){
        String accountNumber = bank.registerAccount("ashabi", "ashanty", "1234");
        bank.deposit(1500, accountNumber);
        assertThrows(IllegalArgumentException.class, () -> bank.transfer("1001", "1002", 1500, "1234"));
    }

    @Test
    public void IThereAreTwoAccountAndOneIsDeleted(){
        String accountNumber = bank.registerAccount("ashabi", "ashanty", "1234");
        assertEquals(2, bank.getSize());
        bank.remove(accountNumber);
        assertEquals(1, bank.getSize());
    }
    
    @Test
    public void quickTest(){
        String accountNumber = bank.registerAccount("ashabi", "ashanty", "1234");
        assertEquals(2, bank.getSize());
        bank.deposit(1500, accountNumber);
        assertEquals(BigDecimal.valueOf(1500), bank.checkBalance("1234", accountNumber));
    }
}
