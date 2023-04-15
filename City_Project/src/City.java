
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class City {
    
    public static void operation(){
        
        String a ="1. Show operation\n"
                + "2. Visit next city\n"
                + "3. Visit previous city\n"
                + "4. Close program";
        System.out.println("********************");
        System.out.println(a);
        System.out.println("********************");
    }
    
     
    public static void visiting(LinkedList<String> city){
        ListIterator<String> iterator = city.listIterator();
        operation();
        Scanner scanner = new Scanner(System.in);
        
        int equation;
        boolean exit = false;
        boolean going = true;
        
        while(!exit){
            System.out.print("Enter an equation number : ");
            
            equation = scanner.nextInt();
            
            switch(equation){
                
                case 1 :
                    operation();
                    break;
                    
                case 2 :
                    
                    if(!going ){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                                            going = true;
                    }
                    if(iterator.hasNext()){
                        System.out.println("Visiting this city : " + iterator.next());
                        
                    }
                    else{
                        System.out.println("There is not any city for visiting..");
                    }
                    break;
                    
                case 3 :
                    if(going){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                    going = false; 
                    }                                      
                    if(iterator.hasPrevious()){
                        System.out.println("Visiting this city : " + iterator.previous());
                        
                    }
                    else{
                        System.out.println("There is not any city for backing...");
                    }
                    break;
                    
                    
                    
                case 4 :
                    System.out.println("Closing the program...");
                    exit = true;
                    break;
                            
            }
                    
            
            
        }
       

    }
    
    
    
    public static void main(String[] args) {
         
        LinkedList<String> city =  new LinkedList<>();
        
        city.add("Baku");
        city.add("Ganja");
        city.add("Naxcivan");
        visiting(city);
    }
}
