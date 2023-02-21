public interface bankApplication{

    int getbalance();
    String depositeMoney(int ammount);
    String withdraw(int ammount,String enterPassword);
    double calculateInterrest(int time);
}
