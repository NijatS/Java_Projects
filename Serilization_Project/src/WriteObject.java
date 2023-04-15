
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class WriteObject {
    
    public static void main(String[] args) {
        
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.txt"))) {
            
            
            Student student1 = new Student("Nijat Soltanov", 5651615, "Java Developer");
            Student student2 = new Student("Murad AbdulKerimov", 12434, "Information Security");
            
            out.writeObject(student1);
            out.writeObject(student2);
        }
    
    
       catch (FileNotFoundException ex) {
            Logger.getLogger(WriteObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(WriteObject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
