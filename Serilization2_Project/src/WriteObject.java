
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


public class WriteObject {
    
    public static void main(String[] args) {
            Student student1 = new Student("Nijat Soltanov", 5651615, "Java Developer");
            Student student2 = new Student("Murad AbdulKerimov", 12434, "Information Security");
            Student student3 = new Student("Farid Xammedov", 156461, "Finance");
            
            Student[] student_array = {student1,student2,student3};
            ArrayList<Student> student_list = new ArrayList<Student>(Arrays.asList(student_array));
            
        
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.txt"))) {
            
            out.writeObject(student_array);
            out.writeObject(student_list);
            
         
        }
    
    
       catch (FileNotFoundException ex) {
            Logger.getLogger(WriteObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(WriteObject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
