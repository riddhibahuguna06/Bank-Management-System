public class Customer{
   
    private String name;
    private String mobileNumber;
    private Account account;
    
    public Customer(int accountNumber , String name , String mobileNumber){
    
     this.mobileNumber = mobileNumber;
     this.name = name;
     this.account = new Account();
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
    }
    
}