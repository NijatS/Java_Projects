
public class Motor {
    private double size;
    private String fuel;
    private double OD;
    private Transmision transmision;

    public Motor(double size, String fuel, double OD, Transmision transmision) {
        this.size = size;
        this.fuel = fuel;
        this.OD = OD;
        this.transmision = transmision;
    }

    /**
     * @return the size
     */
    public double getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * @return the fuel
     */
    public String getFuel() {
        return fuel;
    }

    /**
     * @param fuel the fuel to set
     */
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    /**
     * @return the OD
     */
    public double getOD() {
        return OD;
    }

    /**
     * @param OD the OD to set
     */
    public void setOD(double OD) {
        this.OD = OD;
    }

    /**
     * @return the transmision
     */
    public Transmision getTransmision() {
        return transmision;
    }

    /**
     * @param transmision the transmision to set
     */
    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }
    
}
 