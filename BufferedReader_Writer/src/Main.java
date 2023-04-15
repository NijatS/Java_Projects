
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    
    
    public static void main(String[] args) {
        
        /*try (BufferedWriter writer = new BufferedWriter(new FileWriter("student.txt",true))){
            
            writer.write("Nijat Soltanov,Backend Developer\n");
            writer.write("Murad Abdulkerimov,Frontend Developer\n");
            writer.write("Rehim Abdullayev,Backend Developer\n");
            writer.write("Hajar Huseynova,Frontend Developer\n");
            writer.write("Nuru Allahyarli,Fullstack Developer\n");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
        
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("student.txt")))){
              
            
            while(scanner.hasNextLine()){
                String inform_student = scanner.nextLine();
                String[] array  = inform_student.split(",");
                
                if(array[1].equals("Backend Developer")){
                    System.out.println(inform_student);
                }
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
