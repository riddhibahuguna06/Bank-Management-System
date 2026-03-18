import java.util.* ;
public class Bank {
 private HashMap< String , Customer>accounts ;   

 public Bank(){
    this.accounts = new HashMap<>();

    addCustomer("Riddhi", "9823666632", 10000, "Savings");
    addCustomer("Kartik", "9763000577", 5000, "Current");
 }

 public void addCustomer(String name, String mobileNumber, double balance, String accountType){
    int accountNumber = accounts.size() + 1001 ;  //generate account number from 1001
    Account account = new Account(accountNumber, balance, accountType) ;
  Customer customer = new Customer(name, mobileNumber, account, String.valueOf(accountNumber));
    accounts.put( String.valueOf(accountNumber), customer) ; // account Number is int but key is string
}

public Customer getCustomer(String accountNumber){
   return accounts.get(accountNumber);
}

public void  deposit(String accountNumber , double amount){
 Customer customer = getCustomer(accountNumber) ;
 if(customer == null){
    System.out.println("Account not found");
    return;
 }
 customer.getAccount().deposit(amount);
}

public void withdraw(String accountNumber , double amount){
    Customer customer = getCustomer(accountNumber);
    if(customer == null){
        System.out.println("Account not found");
        return;
    }
    customer.getAccount().withdraw(amount);
}
public void viewTransactionHistory(String accountNumber){
Customer customer = getCustomer(accountNumber);
if(customer ==null){
    System.out.println("Account not found");
    return;
}
customer.getAccount().getTransactionHistory();

}

public void checkBalance(String accountNumber ){
    Customer c =  getCustomer(accountNumber);
 if(c == null){
    System.out.println("Account not found");
    return;
 }
System.out.println("Your balance is : " + c.getAccount().getBalance());

}

public void transferMoney(String senderAccount , String reciverAccount , double amount){
 Customer sender = getCustomer(senderAccount) ;
 Customer reciver = getCustomer(reciverAccount);

 if( sender == null || reciver == null ){
    System.out.println("Account dont exist");
    return;
 }
   System.out.println("The amount you want to transfer: " + amount);
  if(sender.getAccount().getBalance() < amount){
    System.out.println("Insufficent Balance");
    return;
  }
  withdraw(senderAccount, amount);
  deposit(reciverAccount, amount);
  System.out.println("The amount is deposited to the recivers account ");
 
}

public void viewAccounts(){
 for(Customer c : accounts.values()){
    c.getCustomerDetails();
}

}
}
