
import java.util.Scanner;



public class Passenger {
    private int hesab ; 
    private boolean visa;
    private boolean mehbus;
    private boolean passport;
    
    class PassportException extends Exception{

        @Override
        public void printStackTrace() {
            System.out.println("You must have passport!");
        }
      
    }
    class VisaExceptin extends Exception{

        @Override
        public void printStackTrace() {
            System.out.println("You must have visa!");
        }
        
    }
    
    class CountException extends Exception{

        @Override
        public void printStackTrace() {
            System.out.println("Your count is not enough for leaving");

        }
     
    }
    
    class PrisonException extends Exception{

        @Override
        public void printStackTrace() {
            System.out.println("You are a prison and don`t have to leave the country");
        }
        
        
    }
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


    public void passport_check() throws PassportException {
        if(this.passport == false){
            throw new PassportException();
        }
        else{
            System.out.println("Passport checkout finished successfully");
            
        } 
    }

 
    public void visa_check() throws VisaExceptin {
        if(this.visa == false){
        throw new VisaExceptin();
            
        }
        else{
            System.out.println("Visa checkout finished successfully");
           
        } 
    }

    
    public void siyasi_mehkum() throws PrisonException {
           if(this.mehbus == true){
            throw new PrisonException();
        }
        else{
            System.out.println("Prison checkout finished successfully");
            
        } 
    }

   
    public void hesab_check() throws CountException {
        if(hesab > 1500){
            System.out.println("Your count is enough for leaving");
            
        }
        else{
            throw new CountException();
        
    }
}
}
