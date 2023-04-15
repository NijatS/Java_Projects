
import java.util.Scanner;



public class Passenger implements Checkout{
    private int hesab ; 
    private boolean visa;
    private boolean mehbus;
    private boolean passport;
    
    public Passenger(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your count : ");
        this.hesab = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Do you have any visa(Yes or No) : ");
        String answer1 = scanner.nextLine();
        if(answer1.equals("Yes")){
            this.visa = true;
        }
        else {
            this.visa = false;
                }
        System.out.print("Do you have any Passport(Yes or No) : ");
        String answer2 = scanner.nextLine();
        
        if(answer2.equals("Yes")){
            this.passport = true;
        }
        else {
            this.passport = false;
         }
        
        System.out.print("Do you have any polisy prisoner(Yes or No) : ");
        String answer3 = scanner.nextLine();
        if(answer3.equals("Yes")){
            this.mehbus = true;
        }
        else {
            this.mehbus = false;
                }
        
    }

    @Override
    public boolean passport_check() {
        if(this.passport == false){
            System.out.println("You must have passport!");
            return false;
        }
        else{
            System.out.println("Passport checkout finished successfully");
            return true;
        } 
    }

    @Override
    public boolean visa_check() {
        if(this.visa == false){
        System.out.println("You must have visa!");
            return false;
        }
        else{
            System.out.println("Visa checkout finished successfully");
            return true;
        } 
    }

    @Override
    public boolean siyasi_mehkum() {
           if(this.mehbus == true){
        System.out.println("You are prison and do not have to leave this country!!!");
            return false;
        }
        else{
            System.out.println("Prison checkout finished successfully");
            return true;
        } 
    }

    @Override
    public boolean hesab_check() {
        if(hesab > 1500){
            System.out.println("Your count is enough for leaving");
            return true;
        }
        else{
            System.out.println("Your count is not enough for leaving");
            return false;
        
    }
}
}
