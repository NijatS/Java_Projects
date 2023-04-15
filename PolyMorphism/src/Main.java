
import javax.script.ScriptEngine;

class Car{
    private String model;

    public Car(String model) {
        this.model = model;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }
    public String company(){
        return  "Company has this model : " + getModel() ;
    }
    
}
class Mers extends Car{

    public Mers(String model) {
        super(model);
        
    }
    

    @Override
    public String company() {
       return super.company(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

   
    
}
class Hyundai extends Car{

    public Hyundai(String model) {
        super(model);
    }

    @Override
    public String company() {
        return super.company(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

   
    
}
public class Main {
    public static void cc(Car car){
            System.out.println(car.company());
    }
    public static void main(String[] args) {
        cc(new Mers("w211"));
        cc(new Hyundai("Santafe"));
        Hyundai hyundai = new Hyundai("Sonota");
        if(hyundai instanceof Car){
            System.out.println("true");
        }
    }
}
