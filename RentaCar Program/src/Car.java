
public class Car {
    private int id;
    private String make;
    private String brand;
    private String model;
    private String plate;
    private int carYear;
    private String carType;
    private int dailyPrice;
    private boolean atCustomer;

    public Car(int id, String make, String brand, String model, String plate, int carYear, String carType, int dailyPrice,boolean atCustomer) {
        this.id = id;
        this.make = make;
        this.brand = brand;
        this.model = model;
        this.plate = plate;
        this.carYear = carYear;
        this.carType = carType;
        this.dailyPrice = dailyPrice;
        this.atCustomer = atCustomer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(int dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public boolean getAtCustomer() {
        return atCustomer;
    }

    public void setAtCustomer(boolean atCustomer) {
        this.atCustomer = atCustomer;
    }
    
    
    
}
