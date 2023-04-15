
public class Car {
    private Model model;
    private Motor motor;
    private Transmision transmision;

    /**
     * @return the model
     */
    public Model getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(Model model) {
        this.model = model;
    }

    /**
     * @return the motor
     */
    public Motor getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(Motor motor) {
        this.motor = motor;
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

    public Car(Model model, Motor motor, Transmision transmision) {
        this.model = model;
        this.motor = motor;
        this.transmision = transmision;
    }
    
           
}
