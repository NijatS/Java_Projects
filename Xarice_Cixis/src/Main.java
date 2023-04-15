
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
            if(passenger.passport_check()== false){
                continue;
            }
            System.out.println("Your visa is checking...");
            Thread.sleep(5000);
            if(passenger.visa_check()== false){
                continue;
            
        }
             System.out.println("Your count is checking...");
            Thread.sleep(5000);
            if(passenger.hesab_check()== false){
                continue;
        
    }
             System.out.println("Policy prison is checking...");
            Thread.sleep(5000);
            if(passenger.siyasi_mehkum()== false){
                continue;
              }
            break;
        }
    }
}
