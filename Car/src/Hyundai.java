
public class Hyundai extends Car{
    private String motor_type;

    public Hyundai(String country, String model, double motor, int year, int max_speed , String motor_type) {
        super(country, model, motor, year, max_speed );
        this.motor_type = motor_type;
    }

    @Override
    public void Showing() {
        super.Showing(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Motor Type : " + motor_type);
    }
    
}
