 
public class Cycle extends Figure{
    private int radius;

    public Cycle(String kind , int radius) {
        super(kind);
        this.radius = radius;
    }

    @Override
    void calculate_area() {
        System.out.println("The area of " + getKind() + " : " + (radius * radius * Math.PI ));
    }
    
}
