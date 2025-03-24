import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Lab DIO - Bank Account Terminal");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);        
        BankAccount account = new BankAccount();
        boolean hasErrors = false;
        
        do {
            try {
                System.out.print("Enter the account number: ");
                account.setNumber(scanner.nextInt());
                scanner.nextLine();
                hasErrors = false;
            } catch (Exception e) {
                hasErrors = true;
                scanner.nextLine();                                
                System.out.println("Error! Invalid number, please try again.");
            }
        } while (hasErrors);

        System.out.print("Enter the account branch: ");
        account.setBranch(scanner.next());
        scanner.nextLine();

        System.out.print("Enter the account holder: ");
        account.setHolder(scanner.next());
        scanner.nextLine();

        do {
            try {
                System.out.print("Enter the initial balance: ");
                account.deposit(scanner.nextDouble());
                scanner.nextLine();
                hasErrors = false;                
            } catch (Exception e) {
                hasErrors = true;
                scanner.nextLine();                                
                System.out.println("Error! Invalid number, please try again.");
            }
        } while (hasErrors);

        scanner.close();
        
        System.out.printf(
            "Hello %s, thank you for creating an account with our bank, your branch is %s, account %d and your balance $%.2f is now available for withdrawal.", 
            account.getHolder(), account.getBranch(), account.getNumber(), account.getBalance()
        );
    }
}
