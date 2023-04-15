
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ReadObject {
    
    
    public static void main(String[] args) {
        
        
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.txt"))) {
            Student student1 = (Student)in.readObject();
            Student student2 = (Student)in.readObject();
             
            System.out.println(student1);
            System.out.println("*******************");
            System.out.println(student2);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadObject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
