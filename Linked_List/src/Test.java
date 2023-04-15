
import java.util.LinkedList;
import java.util.ListIterator;


public class Test {
      
    public static void showing(LinkedList<String> language){
        
        ListIterator<String> iterator = language.listIterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
        
        public static void sorting( LinkedList<String>language , String newname){
                ListIterator<String> iterator = language.listIterator();
            while(iterator.hasNext()){
                
              int difference =  iterator.next().compareTo(newname);
              
              if(difference == 0){
                  
                 return;
              }
              else if( difference < 0){
                  
                  
              }
              
              else if(difference > 0 ) {
                  iterator.previous();
                  iterator.add(newname);
                  return;
              }
              

            }
                          iterator.add(newname);
            
        }
    
    
    
    
      public static void main(String[] args) {
        
          LinkedList<String> language = new LinkedList<>();
          
          /*language.add("Java");
          language.add("Python"); 
          language.add("C++");*/

          sorting(language, "Python");
          sorting(language, "C++");
          sorting(language, "Java");
          showing(language);
    }
}
