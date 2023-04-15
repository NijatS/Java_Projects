
public class Main {
    public static void main(String[] args) {
        Transmision transmision = new Transmision("AD7sa6das", 4);
        Motor motor = new Motor(2.7,"benzin", 120000, transmision);
        Model model = new Model("Hyundai","Santafe", 2008);
        Car car = new Car(model, motor, transmision);
        System.out.println(car.getModel().getYear());
    }
}
