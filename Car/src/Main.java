
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our fabric...");
        String model = "1. Mercedes\n"
                + "2. BMW\n"
                + "3. Hyundai";
             
        System.out.println("Our models :\n"
        +model);
        System.out.println("********************");
        /*Fabric fabric = new Fabric();
        fabric.fabric_car("Hyundai");*/
        while(true){
            System.out.print("Please select one model : ");
             String equation = scanner.nextLine(); 
             if(equation.equals("q")){
                 break;
             }
             else{
                     Fabric fabric = new Fabric();
                     
           
            Car car = fabric.fabric_car(equation);
            car.Showing();
                if(car == null){
                    System.out.println("Please select correct mark...");
                }
                    else {
                            car.Offroad();
                            }
                     }
            }
        }
    }

