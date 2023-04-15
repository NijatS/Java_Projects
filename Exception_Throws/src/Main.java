

    
import java.io.IOException;
import java.util.Scanner;


public class Main {
   public static void Checking (int age) throws IOException{
       if( age < 18){
           throw new IOException();
       }
       else{
           System.out.println("Welcome our place...");
       }
   } 
    
    public static void main(String[] args) throws IOException {
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter your age : ");
        int age  = scanner.nextInt();
        
        
            Checking(age);
        
    }
    
}


