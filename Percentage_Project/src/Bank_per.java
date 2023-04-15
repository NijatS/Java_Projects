
import java.util.Scanner;


public class Bank_per {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome our bank. Our bank percentage is 6%.");
        
        System.out.print("Investing Money : ");
        int main_money = scanner.nextInt();
        System.out.print("Years : ");
        int year = scanner.nextInt();
        System.out.println();
        double percentage = 0.06;
        double total_money = main_money;
        
        for( int i = 1; i <= year ; i++){
            total_money += (total_money * percentage);
            System.out.println(i + ".year : " + (int)total_money);
        }
    }
}
