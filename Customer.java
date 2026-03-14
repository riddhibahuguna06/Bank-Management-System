public class Customer{
    private int accountNumber;
    private String name;
    private String mobileNumber;
    
    public Customer(int accountNumber , String name , String mobileNumber){
     this.accountNumber = accountNumber ;
     this.mobileNumber = mobileNumber;
     this.name = name;
    }

    public String getName(){
        return name ;
    }

    public String getMobileNum(){
        return mobileNumber ;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
}