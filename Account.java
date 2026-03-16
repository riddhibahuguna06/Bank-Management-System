import java.util.ArrayList;

public class Account {
    private int accountNumber;
    private double balance;
    private String accountType;
    private ArrayList<String> transactionHistory;
    
   
    public Account(int accountNumber, double balance , String accountType , String tranArrayList){
        this.accountNumber = accountNumber ;
        this.balance = balance ;
        this.accountType = accountType ;
        this.transactionHistory = new ArrayList<>();
        
    }

    public int getAccountnumber(){
      return accountNumber ;
    }

    public double getBalance(){
        return balance;
    }

    public void setaccountType(){
       System.out.println("Your account type is : " + accountType);
    }

   public void deposit(double amount){
    System.out.println("The amount you want to deposit : " + amount);
    balance += amount ;
    System.out.println("Total balance: " + balance);

   }

   public void withdraw(double amount){
    
   }


}
