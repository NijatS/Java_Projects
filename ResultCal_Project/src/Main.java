
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    
    
    public static String ResultCalculator(String name , int first , int second , int finalres) {
     double result = first *3 / 10.0 + second * 3 / 10.0 + finalres * 4 / 10.0;
     String result_list ="";
     
    if(result > 90){
         result_list = "Student " + name + "`s Result : " + "A";
     }
    else if(result > 80){
         result_list = "Student " + name + "`s Result : " + "B";
     }
    else if(result > 70){
         result_list = "Student " + name + "`s Result : " + "C";
     }
     else if(result > 60){
         result_list = "Student " + name + "`s Result : " + "F";
     }
     else if(result > 50){
         result_list = "Student " + name + "`s Result : " + "E";
     }
     else {
         result_list = "Student " + name + "`s Result : " + "Fail";
     }
    
    return result_list;
     
}
   
    
    public static void main(String[] args) {
        
        try(Scanner scanner = new Scanner(new FileReader("dosya.txt"));
        FileWriter writer = new FileWriter("result.txt")){
            
            while(scanner.hasNextLine()){
                String inform_student = scanner.nextLine();
                String[] array = inform_student.split(",");
                int value1 = Integer.valueOf(array[1]);
                int value2 = Integer.valueOf(array[2]);
                int value3 = Integer.valueOf(array[3]);
                
                String result = ResultCalculator(array[0], value1, value2, value3);
                writer.write(result+"\n");
            }
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
