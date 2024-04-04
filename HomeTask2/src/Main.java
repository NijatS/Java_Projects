
import service.Service;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        Service service = new Service();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter first number:");
        int firstNumber = scan.nextInt();
        System.out.print("Enter second number:");
        int secondNumber = scan.nextInt();
        System.out.println("Min Number is "+service.MinNumber(firstNumber, secondNumber));
        
        System.out.print("Enter first weight:");
        float firstWeight = scan.nextFloat();
        System.out.print("Enter second weight:");
        float secondWeight  = scan.nextFloat();
        System.out.println("Remainder  "+Service.ReminderWeight(firstWeight, secondWeight));
    }
    
}
