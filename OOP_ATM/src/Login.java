
import java.util.Scanner;


public class Login {
    public boolean login(Account account){
        Scanner scanner = new Scanner(System.in);
        String username1;
        String parol1;
        System.out.print("Enter Username : ");
        username1 = scanner.nextLine();
        System.out.print("Enter Parol : ");
        parol1 = scanner.nextLine();
        
        if ((account.getUsername().equals(username1)) && (account.getParol().equals(parol1))){
            return true;
        }
        else{
            return false;
        }
    }
}
