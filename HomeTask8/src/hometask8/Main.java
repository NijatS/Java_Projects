package hometask8;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        
        try{
            Scanner scanner = new Scanner(System.in);
           int number = scanner.nextInt();
           CheckNumber(number);
        }
        catch(Exception ex){
            System.out.println( ex.getMessage());
            
        }
    }
    
    
    
    public static void CheckNumber(int number) throws NegativeNumberException{
        
        if(number < 0){
            throw new NegativeNumberException();
        }
    }
    
}
