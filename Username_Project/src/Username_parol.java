
import java.util.Scanner;


public class Username_parol {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        String username = "nijatsoltanov";
        String parol = "12345";
        int chance = 3;

        while ( true ){
            System.out.println("****************");
            System.out.print("Username : ");
            String username1 = scanner.nextLine();
            System.out.print("Parol : ");
            String parol1 = scanner.nextLine();
            System.out.println("****************");
            if(username1.equals(username) && parol1.equals(parol)){
                System.out.println("Entering your account...");
                break;
            }
            else if(!(username1.equals(username)) && parol1.equals(parol)){
                System.out.println("Username is wrong !!");
                chance--;
                System.out.println("Your chance : " + chance);
            }
            else if(username1.equals(username) && !(parol1.equals(parol))){
                System.out.println("Parol is wrong !!");
                chance--;
                System.out.println("Your chance : " + chance);
            }
            else{
                System.out.println("Username and Parol is not correct !!");
                chance--;
                System.out.println("Your chance : " + chance);
            }
            if(chance == 0){ 
                System.out.println("Your chance is over and please to check 30 minutes later..");
                break;
            }
        }
    }
}
