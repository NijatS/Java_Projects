
import java.util.Scanner;


public class FindingEbob {
    public static int ebob(int number1 , int number2){
        int ebob=1;
        for (int i = 1 ; i <= number1 && i <= number2 ; i++  ){
            if(number1 % i == 0 && number2 % i == 0){
                ebob = i;
               
            }
        }
        return ebob;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int number1 = scanner.nextInt();
        System.out.print("Enter Second Number : ");
        int number2 = scanner.nextInt();
        System.out.println("EBOB : " + ebob(number1, number2));
    }
}
