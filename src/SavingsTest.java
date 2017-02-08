import org.testng.annotations.Test;

import static org.junit.Assert.*;

/**
 * Created by Nicholas on 2/7/2017.
 */
public class SavingsTest {
    @Test
    public void testSavingsAccount()
    {
        Savings f = new Savings();
    }

    @Test
    public void testDeposit()
    {
        Savings myAccount = new Savings();
        myAccount.setBalance(0);
        myAccount.deposit(5000);
        assertEquals(5000, myAccount.getBalance());
    }
}