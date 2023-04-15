
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ReadObject {
    
    
    public static void main(String[] args) {
        
        
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.txt"))) {
            Student[] student_array = (Student[])in.readObject();
                    
            ArrayList<Student> student_list = (ArrayList < Student >)in.readObject();
            System.out.println("**************************");
             for(Student s : student_array){
                 System.out.println(s);
                 System.out.println("---------------");
             }
             System.out.println("**************************");
             for(Student a : student_list){
                 System.out.println(a);
                 System.out.println("---------------");
             }
             System.out.println("**************************");
            
                    
                    
                    
                    
                    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadObject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
