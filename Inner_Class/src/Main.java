
import java.util.Scanner;


public class Main {
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String equations = "Equations...\n"
                + "1. Calculate Triangle Perimetr\n"
                + "2. Calculate Cycle Area\n"
                + "3. Calculate Product of 2 Vectors\n"
                + "Exit with 'q'";
        while (true){
            System.out.println(equations);
            System.out.print("Please enter equation number which you want : ");
            String equation = scanner.nextLine();            
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
                Problem.math.Perimetr_Triangle(a, b, c);
                
            }
            else if(equation.equals("2")){
                System.out.print("Please enter radius : ");
                int r = scanner.nextInt();
                scanner.nextLine();
                Problem.math.Area_Cycle(r);
            }
            else if(equation.equals("3")){
                Vector vector1 = new Vector("vec1");
                Vector vector2 = new Vector("vec2");
                Problem.physics.Product_Vector(vector1, vector2);
                
            }    
            else{
                System.out.println("Error...");
            }
        }
        
    }
}


