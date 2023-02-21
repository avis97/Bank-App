import java.util.UUID;

public class SBIaccount implements bankApplication{
    private String Name;
    private String AccountNumber;
    private int balance;
    public String password;
    private double rateOfinterest;


    public SBIaccount(String name, int balance, String password) {
        this.Name = name;
        this.balance = balance;
        this.password = password;

        this.rateOfinterest=6.6;
        this.AccountNumber= String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public int getBalance(){
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfinterest() {
        return rateOfinterest;
    }

    public void setRateOfinterest(double rateOfinterest) {
        this.rateOfinterest = rateOfinterest;
    }

    @Override
    public int getbalance() {
        return this.balance;
    }

    @Override
    public String depositeMoney(int ammount){
        this.balance+=ammount;
        return "Added money on your bank account"+ammount;
    }

    @Override
    public String withdraw(int ammount,String enterPassword) {
        if(enterPassword.equals(this.password))
        {
            if(balance<ammount)
            {
                return "dont have balance";
            }
            else
            {
                balance-=ammount;
                return "You can take your money";
            }
        }
        else
        {
            return "Password not match";
        }
    }

    @Override
    public double calculateInterrest(int time){
        return (balance * rateOfinterest * time) / 100.0;
    }
}
