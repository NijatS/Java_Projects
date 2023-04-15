
import java.util.Scanner;


public class Car implements ICar{

    @Override
    public void kind(double door_number) {
        if(door_number == 2){
            System.out.println("These is a sport car");
           
                    }
        else if(door_number == 4){
            System.out.println("These is a normal car");
        }
        else{
            System.out.println("Error!");
        }
    }

    @Override
    public void performance() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter horse power : ");
        int horse_power = scanner.nextInt();
        if(horse_power > 300){
            System.out.println("This model is faster than normal");
        }
        else{
            System.out.println("This model is slower than sport");
    }
    }
    public void motor(double motor) {
        
        System.out.println("Motor :" + motor);
    }

    @Override
    public void special_function(String[] edition) {
        
        for(int i = 0 ; i < edition.length ; i++){
            
        System.out.println("Editions : " + edition[i]);
    }
    }
    
}
