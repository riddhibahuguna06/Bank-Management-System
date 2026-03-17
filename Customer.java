public class Customer{
   
    private String name;
    private String mobileNumber;
    private Account account;
    
    public Customer( String name , String mobileNumber , Account account){
    
     this.mobileNumber = mobileNumber;
     this.name = name;
     this.account = account ;
    }

    public Account getAccount(){
    return account ;
    }
    public String getName(){
        return  name ;
    }
    
    public String getMobileNum(){
        return mobileNumber ;
    }

   
    public void getCustomerDetails(){
    System.out.println("Name of the customer: " + getName());
    System.out.println("Mobile number of the customer: " + getMobileNum());
    System.out.println("Your Account details: ");
     account.getAccountDetails();
    }
    
}