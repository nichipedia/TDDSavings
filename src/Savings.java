/**
 * Created by Nicholas on 2/7/2017.
 */
public class Savings
{
    private int balance;

    public int getBalance()
    {
        return balance;
    }

    public void setBalance(int balance)
    {
        this.balance = balance;
    }

    public Savings()
    {
        this.balance = 0;
    }

    public void deposit(int amount)
    {
        this.balance += amount;
    }


}
