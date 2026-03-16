import java.util.ArrayList;

public class Account {
    private int accountNumber;
    private double balance;
    private String accountType;
    private ArrayList<String> transactionHistory;
    String transaction;
    
   
    public Account(int accountNumber, double balance , String accountType ){
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

   public void deposit(double amount){
    System.out.println("The amount you want to deposit : " + amount);
    if(amount > 0){
     balance += amount ;
    System.out.println("Total balance: " + balance);

     transaction = "Deposited: " + amount + " | Balance: " + balance;
    transactionHistory.add(transaction);
     
    }
   
   }

   public void withdraw(double amount){
    System.out.println("The amount you want to withdraw: " + amount);
    if(amount > 0 && amount <= balance ){
    balance -= amount ;
    System.out.println("Total balance: " + balance);

    transaction = "Withdrawn: " + amount + " | Balance: " + balance;
    transactionHistory.add(transaction) ;

    }
}

  public void getTransactionHistory(){
    if(!transactionHistory.isEmpty()){
     for(String t : transactionHistory ){
        System.out.println(" " + t );
     }
    }else{
        System.out.println("No transactions happend yet!");
    }
 }

    public void getAccountDetails(){
    System.out.println("Account Number: " + getAccountnumber());
    System.out.println("Acccount balance: " + getBalance());
    System.out.println("Account Type: " + accountType);
   
    }

   }



