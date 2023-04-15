
public class Square extends Figure{
    private  double side ;

    public Square(String kind , int side) {
        super(kind);
        this.side = side;
    }

    @Override
    void calculate_area() {
        System.out.println("The area of " + getKind() + " : " +(side * side));
    }
}
