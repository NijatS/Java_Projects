package hometask4;
import java.util.Scanner;

public class HomeTask4 {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many number do you want to add:");
        int maxNumber=  scan.nextInt();
        int i = 1;
        int sum = 0;
        
        while(i<=maxNumber){
            System.out.print("Number "+ i+ " :");
            int value = scan.nextInt();
            if(value > 10 && value < 30){
                sum+=value;
            }
            i++;
        }
        
        System.out.println("Sum :"+ sum);
    }
    
}
