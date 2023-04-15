
public class Main {
    
    
    public static void main(String[] args) {
        
        Character[] series_char = {'N' , 'I' , 'J' , 'A' , 'T'};
        String[] series_string = {"Nijat" , "Soltanov" , "Ceyhun"};
        
        /*Print print = new Print();
        print.print_series(series_char);
        print.print_series(series_string);*/
        println(series_char);
        println(series_string);
    }
        public static <E> void println(E[] series){
            
            for(E e: series ){
                System.out.println(e);
            }
        }
    
}
