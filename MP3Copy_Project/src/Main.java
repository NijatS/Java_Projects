
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    private static ArrayList<Integer> mp3_list = new ArrayList<>();
    
    
    public static void Read(){
        
        try {
            FileInputStream in = new FileInputStream("mesedi.mp3");
            
            
            int value;
            
            while((value = in.read())!= -1){
                
                mp3_list.add(value);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public static void Copy(String document_name){
        
        
        try {
            FileOutputStream out = new FileOutputStream(document_name);
                    for(int value : mp3_list){
                        out.write(value);
                    }
                
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void main(String[] args) {
        
        Read();
        Copy("mesedi2.mp3");
        
    }
}
