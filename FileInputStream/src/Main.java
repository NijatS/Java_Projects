
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    
    public static void main(String[] args) throws IOException  {
        
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("document.txt");
            
        String s = "";
        int value;
        
        while((value = fis.read()) != -1){
            s+= (char)value;
        }
        System.out.println(s);
        
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("File is not found");
        }
        finally{
            try {
                if(fis != null){
                fis.close();
                }
            } catch (IOException ex) {
                System.out.println("Input Output Exception...");
            }
        }
    }
}
