
public class Main {
    
    public static void main(String[] args) {
        
        FirstType st1 = new FirstType(70, 60, 90, 75);
        FirstType st2 = new FirstType(50,70, 80, 60);
        
        SecondType st3 = new SecondType(80, 70, 50, 90);
        SecondType st4 = new SecondType(75, 75, 45, 95);
        
        //FirstType first = comparison(st1, st2);
        
        //SecondType first = comparison(st3, st4);
        
        System.out.println(comparison(st1, st2).calculation());
        System.out.println(comparison(st3, st4).calculation());
    }
    
    
    public static <E extends Subject> E comparison(E e1 ,E e2){ //Generic method
         if(e1.calculation() > e2.calculation()){
             return  e1;
         }
         else {
             return  e2;
         }
    }
}
