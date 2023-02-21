import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name,password and your ammount");
        String Name=sc.next();
        String password=sc.next();
        int balance=sc.nextInt();

        SBIaccount bl=new SBIaccount(Name,balance,password);

        System.out.println("Your account have been created by"+bl.getAccountNumber());

        // current balance
        System.out.println("Your current balance is"+bl.getBalance());

        //diposite
        System.out.println(bl.depositeMoney(500));
        System.out.println("Your new bank balance is"+bl.getBalance());

        //withdraw
        System.out.println("Enter your withdraw ammount->");

        int ammount=sc.nextInt();
        System.out.println("Enter your password");
        String enterPassword=sc.next();

        System.out.println(bl.withdraw(ammount,enterPassword));
        System.out.println("Your current balance is"+bl.getBalance());
        System.out.println("Your 4 year currentbalance and interest is"+bl.getBalance()+"is"+bl.calculateInterrest(4));

    }
}