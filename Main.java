import java.util.* ;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

Bank bank = new Bank() ; 

while(true){

    System.out.println("-------------Menu------------");
    System.out.println("1. Deposit\n" +
                      "2. Withdraw\n" +
                      "3. View Transaction History\n" +
                      "4. New Account\n" +
                      "5. View all accounts\n" +
                      "6. Exit" );
    
    System.out.println("Chosse an option from the menu: ");
    int choice = sc.nextInt() ;
    sc.nextLine();

    String accountNumber = "";
    Customer c = null ;
    double amount = 0 ;

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
            
            break;

        case 4:
            
            break;

        case 5 :
            
            break;
        default:
            break;
    }

}
}
    }
