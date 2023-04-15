
import java.util.Scanner;


public class Login {
    public boolean login(Account account){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your username : ");
        String username1 = scanner.nextLine();
        System.out.print("Your password : ");
        String password1 = scanner.nextLine();
        if(account.getUsername().equals(username1) && account.getPassword().equals(password1)){
            return true;
        }
        else { 
            return false;
        }
    }
}
