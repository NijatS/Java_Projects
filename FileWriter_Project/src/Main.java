
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    
    
    public static void main(String[] args) {
        
        
        
        try(FileWriter languages = new FileWriter("languages.txt")){
            
            Scanner scanner = new Scanner(System.in);
            String language;
            
            while(true){
                System.out.print("Enter Language : ");
                language = scanner.nextLine();
                
                if(language.equals("-1")){
                    System.out.println("Stoping the program");
                    break;
                }
                languages.write(language + "\n");
            }
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
