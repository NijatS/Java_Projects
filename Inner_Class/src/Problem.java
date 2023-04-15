
public class Problem {
    
    public static class math{
            
        public static void Area_Cycle(int radius){
            System.out.println("Cycle area : " + (Math.PI * radius * radius));
        }
        
        public static void Perimetr_Triangle(int a , int b , int c){
            
            int p = a + b + c;
            System.out.println("Perimetr of triangle : " + p);
        }
        
    }
    
    
    public static class physics{
        
        public static void Product_Vector(Vector vector1 , Vector vector2){
            
            int p = vector1.getI() * vector2.getI() + vector1.getJ() * vector2.getJ() + vector1.getK() * vector2.getK() ;
            
            System.out.println("Product of two vectors : " + p);
        }
        
        
    }
}
