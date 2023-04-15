
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    
    public static void main(String[] args) {
        
        FileOutputStream fos = null;
        
        try {
            fos = new FileOutputStream("document.txt",true);
            String s = "Nijat Soltanov";
            byte[] s_array = s.getBytes();
            fos.write(s_array);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found Exception..");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("Exiting problem...");
            }
        }
    }
    
}
