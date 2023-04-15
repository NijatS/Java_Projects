
import java.util.Scanner;


public class Main {
   public static void Checking(int age){
       if( age < 18){
           throw new ArithmeticException();
       }
       else{
           System.out.println("Welcome our place...");
       }
   } 
    
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter your age : ");
        int age  = scanner.nextInt();
        
        try{
            Checking(age);
        }
        catch(ArithmeticException e){
            System.out.println("People under the age of 18 cannot enter...");
        }
    }
    
}
