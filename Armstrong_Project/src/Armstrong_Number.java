
import java.util.Scanner;


public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = scan.nextInt();
        int step_number = 0 , sum = 0;
        int a_number = number;
        int b_number = number;
        while(b_number>0){
            b_number/=10;
            step_number++;
        }
      do{
         int step_value = a_number%10;
         a_number/=10;

                 sum+= Math.pow(step_value, step_number);
         
      } 
      while(a_number > 0);
      
      if (number == sum){
          System.out.println("This number is Armstorng Number");
      }
      else {
          System.out.println("This number is not Armstorng Number");
      }
    }
}
