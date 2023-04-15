
import java.util.Scanner;


public class ATM {
    public void work(Account account){
        
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****************");
        System.out.println("Welcome to our Bank");
        System.out.println("*****************");
        int chance = 3;
        while (true) { 
            if(login.login(account)){
                System.out.println("Login Successful...");
                break;
            }
            else{
                chance --;
                System.out.println("Login failed ...");
                System.out.println("Your chance : " + chance);
            }
            if(chance == 0){
                System.out.println("Your chance is over : ");
                return;
            }
        }
        String inf = "1. Your count \n"
                + "2. Adding process \n"
                + "3. Withdrawing process \n"
                + "If you want to close proqram , pleace to press 'Q'";
        System.out.println(inf);
        
        while (true) {
            System.out.print("Process number : ");
            String process = scanner.nextLine();
            if(process.equals("1")){
                System.out.println("Your Count : " + account.getCount() );
        }
            else if(process.equals("2")){
                System.out.print("Please enter the amount of money which you want to add : ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                account.Adding(amount);
                
            }
            else if (process.equals("3")){
                System.out.print("Please enter the amount of money which you want to withdraw : ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                account.Withdraw(amount);
            }
            else if (process.equals("q")){
                break;
                
            }
            else{
                System.out.println("Please enter correct process number");
            }
    }
}
}