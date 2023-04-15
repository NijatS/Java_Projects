
import java.util.Scanner;




public class Calculator {
    public static int adding(int a , int b){
        return (a + b);
    }

    public static int adding(int a , int b , int c){
        return (a + b + c);
    }
    
    public static int subtraction( int a , int b){
        return ( a - b);
    }
    
    public static int multiplication( int a , int b ){
        return ( a * b);
    }
    
    public static int multiplication( int a , int b , int c){
        return ( a * b * c);
    }
    
    public static double division(double a , double b){
        return (Double)( a / b );
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("**********************************");
        
        System.out.println("1 . Adding ");
        System.out.println("2 . Subtraction");
        System.out.println("3 . Multiplication");
        System.out.println("4 . Division");
        System.out.println("If you want to close proqram , please to press 'q' ");
        
        System.out.println("**********************************");
      
        
        System.out.println("");
        
        while( true ){
        System.out.print("Please enter a number of operation : ");
        String operation = scanner.nextLine();
        
            if(operation.equals("1")){
                System.out.print("How many numbers : ");
                int number1 = scanner.nextInt();
                if (number1 == 2){
                    System.out.print("Enter first number : ");
                    int first_number = scanner.nextInt();
                    
                    System.out.print("Enter second number : ");
                    int second_number = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Addition of numbers : " + adding(first_number, second_number));
                }
                else if (number1 == 3){
                    System.out.print("Enter first number : ");
                    int first_number = scanner.nextInt();
                    System.out.print("Enter second number : ");
                    int second_number = scanner.nextInt();
                    System.out.print("Enter third number : ");
                    int third_number = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Addition of numbers : " + adding(first_number, second_number, third_number));  
                }
                else{
                    scanner.nextLine();
                    System.out.println("Please enter correct number ...");
                }
            }
            else if(operation.equals("2")){
                    System.out.print("Enter first number : ");
                    int first_number = scanner.nextInt();
                    System.out.print("Enter second number : ");
                    int second_number = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Subtraction of numbers : " + subtraction(first_number, second_number));
            }
            else if(operation.equals("3")){
                System.out.print("How many numbers : ");
                int number1 = scanner.nextInt();
                if (number1 == 2){
                    System.out.print("Enter first number : ");
                    int first_number = scanner.nextInt();
                    System.out.print("Enter second number : ");
                    int second_number = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Multiplication of numbers : " + multiplication(first_number, second_number));
                }
                else if (number1 == 3){
                    System.out.print("Enter first number : ");
                    int first_number = scanner.nextInt();
                    System.out.print("Enter second number : ");
                    int second_number = scanner.nextInt();
                    System.out.print("Enter third number : ");
                    int third_number = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Multiplication of numbers : " + multiplication(first_number, second_number, third_number));
                }
            }
            else if(operation.equals("4")){
                    System.out.print("Enter first number : ");
                    double first_number = scanner.nextDouble();
                    System.out.print("Enter second number : ");
                    double second_number = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Division of numbers : " + division(first_number, second_number));
            }
            else if(operation.equals("q")){
                 System.out.println("Closing the program ....");
                 break;
            }
            else{
                System.out.println("Please enter true operation number");
            }
        }
    }
}

   