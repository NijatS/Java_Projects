
package hometask7;
import java.util.ArrayList;

public class Main {
   
    public static void main(String[] args) {
        
        Shape shape = new Shape("Test1","Test1");
        Shape shape2 = new Rectangle("Test2","Test2");
        Shape shape3 = new Circle("Test2","Test2");

        
        //shape.compareObjDetail(shape2);
        shape.printDetail();
        shape2.printDetail();
        
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(shape);
        shapes.add(shape2);
        shapes.add(shape3);
        
        for(Shape listShape: shapes){
            listShape.printDetail();
        }
                


    }
    
}


























