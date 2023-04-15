
import java.util.Scanner;


public class Main {
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String equations = "Equations...\n"
                + "1. Calculate Triangle Area\n"
                + "2. Calculate Cycle Area\n"
                + "3. Calculate Square Area\n"
                + "Exit with 'q'";
        while (true){
            System.out.println(equations);
            System.out.print("Please enter equation number which you want : ");
            String equation = scanner.nextLine();
            Figure figure = null;
            
            if(equation.equals("q")){
                System.out.println("Closing the program...");
                break;
            }
            else if(equation.equals("1")){
                System.out.print("Please enter first side : ");
                int a = scanner.nextInt();
                System.out.print("Please enter second side : ");
                int b = scanner.nextInt();
                System.out.print("Please enter third side : ");
                int c = scanner.nextInt();
                scanner.nextLine();
                figure = new Triangle("Triangle1",a, b, c);
                figure.calculate_area();
            }
            else if(equation.equals("2")){
                System.out.print("Please enter radius : ");
                int r = scanner.nextInt();
                scanner.nextLine();
                figure = new Cycle("Cycle1", r);
                figure.calculate_area();
            }
            else if(equation.equals("3")){
                System.out.print("Please enter side : ");
                int a = scanner.nextInt();
                scanner.nextLine();
                figure = new Square("Square1", a);
                figure.calculate_area();
            }    
            else{
                System.out.println("Error...");
            }
        }
        
    }
}
