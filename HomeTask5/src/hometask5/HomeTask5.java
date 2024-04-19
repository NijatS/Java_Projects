
package hometask5;
import java.util.Scanner;

public class HomeTask5 {
 // 3.  Write a program that accepts 10 numbers in array. Print only the even numbers.
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         
         int[] numbers = {2,6,14,73,34,764,23,76,3,42};
         System.out.print("Even Numbers: ");
         for(int number : numbers){
             if(number % 2 == 0){
                 System.out.print(number+ " ");
             }
    }
    }
    
}
