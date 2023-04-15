
import java.util.InputMismatchException;
import java.util.Scanner;

class MultiplicationException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Please enter little numbers...");
    }
    
    
    
}
public class Main {
    public static void main(String[] args) {
        // Switch Case Kullanarak 4 işlem yapan bir hesap makinesi tasarlamaya çalışın.
        Scanner scanner = new Scanner(System.in);
        System.out.println("************************************");
        String islemler = "1. Adding\n"
                          +"2. Subtraction\n"
                          +"3. Multiplication\n"
                          +"4. Divison";
        System.out.println(islemler);
        System.out.println("************************************");
        System.out.print("Select equation number : ");
        String islem = scanner.nextLine();
        int a;
        int b;
        try{
            
        
        switch(islem){
            case "1":
                System.out.print("First Number : ");
                a = scanner.nextInt();
                System.out.print("Second Number : ");
                b = scanner.nextInt();
                System.out.println("Result : " + (a+b));
                break;
            case "2":
                System.out.print("First Number : ");
                a = scanner.nextInt();
                System.out.print("Second Number : ");
                b = scanner.nextInt();
                System.out.println("Result : " + (a-b));
                break;
            case "3":
                System.out.print("First Number : ");
                a = scanner.nextInt();
                System.out.print("Second Number : ");
                b = scanner.nextInt();
                if(a>10000 || b > 10000){
                    throw new MultiplicationException();
                }
                System.out.println("Result : " + (a * b));
                break;
            case "4":
                System.out.print("First Number : ");
                a = scanner.nextInt();
                System.out.print("Second Number : ");
                b = scanner.nextInt();
                System.out.println("Result : " + (a / b));
                break;
            default:
                System.out.println("Unknown Process");
                
            
        }
        }
        catch(ArithmeticException e){
            System.out.println("Bir eded 0 a bolunmez..");
        }
        catch(InputMismatchException e){
            System.out.println("Please enter correct input format");
        }
        catch(MultiplicationException e){
            e.printStackTrace();
        }

    }
}