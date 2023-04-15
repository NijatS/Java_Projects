
public class BMW extends Car{
    private String edition;

    public BMW(String country, String model, double motor, int year, int max_speed, String edition) {
        super(country, model, motor, year, max_speed);
        this.edition = edition;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    @Override
    public void Offroad() {
        super.Offroad(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void Showing() {
        super.Showing(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Edition : " + edition);
    }
    
}
