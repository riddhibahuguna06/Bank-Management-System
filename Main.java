import java.util.* ;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

Bank bank = new Bank() ; 

while(true){

     String accountNumber = "";
     double amount = 0 ;


    System.out.println("-------------Menu------------");
    System.out.println("1. Deposit\n" +
                      "2. Withdraw\n" +
                      "3. View Transaction History\n" +
                      "4. New Account\n" +
                      "5. View all accounts\n" +
                      "6. Check Balance\n" +
                      "7. Transfer Money\n" +
                      "8. Exit" );
    
    System.out.println("Chosse an option from the menu: ");
    int choice = sc.nextInt() ;
    sc.nextLine();


    switch (choice) {

        case 1: // Deposit
        System.out.println("Your Account number: ");
        accountNumber = sc.next();
        sc.nextLine();

        System.out.println("Amount you want to deposit: ");
        amount = sc.nextDouble() ;

        bank.deposit(accountNumber, amount);
            
            break;
        
        case 2: // withdraw
            System.out.println("Your Account number: ");
            accountNumber = sc.next();
            sc.nextLine();

            System.out.println("Amount you want to withdraw: ");
            amount = sc.nextDouble();

            bank.withdraw(accountNumber, amount);
            
            break;

        case 3: // transaction history
        System.out.println("Your Account Number: ");
        accountNumber = sc.next();
        sc.nextLine();

        bank.viewTransactionHistory(accountNumber) ;
            break;

        case 4 : // Add new account

        System.out.println("Your name : ");
        String name = sc.next();
        sc.nextLine();

        System.out.println("Your mobile number: ");
        String mobileNumber = sc.next();
        sc.nextLine();

        System.out.println("Your Account type: ");
        String accountType = sc.next();
        sc.nextLine() ;

        System.out.println("Balance you want add to your account: ");
        double balance = sc.nextDouble();
       
        bank.addCustomer(name, mobileNumber, balance , accountType);
            
            break;

         case 5: // viewAccounts

            bank.viewAccounts();
            break;

        case 6 : //check balance
        System.out.println("Your Account Number: ");
        accountNumber = sc.next();
        sc.nextLine();

        bank.checkBalance(accountNumber) ;

        break;

        case 7: //transfer money
         
        System.out.println("Your Account Number (Sender): ");
        String senderAccount = sc.next();
        sc.nextLine() ;

        System.out.println("Your Account Number (Reciver): ");
        String reciverAccount = sc.next();
        sc.nextLine();

        System.out.println("Amount you want to transfer: ");
        amount = sc.nextDouble();
        sc.nextLine();

        bank.transferMoney(senderAccount, reciverAccount, amount);

       break;

        case 8 :
         System.out.println("Goodbye!");   //exit 
                sc.close();   
            return;
        
        default:
            break;
    }

}
}
    }
