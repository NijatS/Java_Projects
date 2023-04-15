
public class Car {
    private String country;
    private String model;
    private double motor;
    private int year;
    private int max_speed;

    public Car(String country, String model, double motor, int year, int max_speed) {
        this.country = country;
        this.model = model;
        this.motor = motor;
        this.year = year;
        this.max_speed = max_speed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }
    public void Offroad(){
        System.out.println("This car is driven in offroad...");
    }
    public void Showing(){
        System.out.println("Country : " + getCountry());
        System.out.println("Model : "+ getModel() );
        System.out.println("Motor : " + getMotor());
        System.out.println("Year : " + getYear());
        System.out.println("Max Speed : " + max_speed);
    }
}
