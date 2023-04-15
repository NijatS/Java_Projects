
public class Triangle extends Figure{
    private  int side1;
    private  int side2;
    private  int side3;

    public Triangle(String kind , int side1 , int side2 , int side3) {
        super(kind);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    

    @Override
    void calculate_area() {
        double u = ((side1 + side2 + side3) / 2.0 );
        double area = Math.sqrt( u * (u - side1) * (u -  side2 ) * (u - side3));
        System.out.println("The area of " + getKind() + " : " + area);
    }
    
    
}
