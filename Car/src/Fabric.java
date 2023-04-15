
public class Fabric {
 
    public Car fabric_car(String marka){
        
      if(marka.equals("Mercedes")){
          return new Mercedes("Germany", "W211", 3.5, 2008, 320, "AMG");
      }
      else if(marka.equals("BMW")){
          return new BMW("Germany", "F30", 2.0, 2015, 300, "M paket");
      }
      else if(marka.equals("Hyundai")){
          return new Hyundai("Korea", "Santafe", 2.7, 2008, 220, "Remen");
      }
      else{
          return null;
      }
    }
    
}
