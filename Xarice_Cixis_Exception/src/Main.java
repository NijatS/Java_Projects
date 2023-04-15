
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {


    public static void main(String[] args) throws InterruptedException {
        String rule  = "*You must have visa\n"
                + "*You must have more than 1500 $\n"
                + "*You must have passport\n"
                + "*You are not policy prison";
 
        System.out.println("************");
        System.out.println("Rule for leaving :");
        System.out.println(rule);
        System.out.println("************");
        Thread.sleep(4000);
        
        while(true){
            Passenger passenger = new Passenger();
            
            System.out.println("Your passport is checking...");
            Thread.sleep(5000);
            try {
                passenger.passport_check();
            } catch (Passenger.PassportException ex) {
                ex.printStackTrace();
                continue;
            }
            System.out.println("Your visa is checking...");
            Thread.sleep(5000);
            
            try {
                passenger.visa_check();
            } catch (Passenger.VisaExceptin ex) {
               ex.printStackTrace();
                continue;            }
             System.out.println("Your count is checking...");
            Thread.sleep(5000);
            try {
                passenger.hesab_check();
            } catch (Passenger.CountException ex) {
                ex.printStackTrace();
                continue;
            }
            
             System.out.println("Policy prison is checking...");
            Thread.sleep(5000);
            try {
                passenger.siyasi_mehkum();
            } catch (Passenger.PrisonException ex) {
                ex.printStackTrace();
                continue;
            }
            
            
            break;
        }
    }
}
