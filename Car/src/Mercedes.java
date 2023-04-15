
public class Mercedes extends Car{
    private String edition;

    public Mercedes(String country, String model, double motor, int year, int max_speed, String edition) {
        super(country, model, motor, year, max_speed);
        this.edition = edition;
    }

    /**
     * @return the edition
     */
    public String getEdition() {
        return edition;
    }

    /**
     * @param edition the edition to set
     */
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
