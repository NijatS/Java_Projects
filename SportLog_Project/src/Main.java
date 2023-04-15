
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to sport program ..");
        System.out.println("************************");
        String sport = "1. Burpee\n"
                + "2. Pushup\n"
                + "3. Situp\n"
                + "4. Squat";
        System.out.println(sport);
        System.out.println("Create sport program  ");
                System.out.print("Amount of Burpee : ");
        int burpee = scanner.nextInt();
                System.out.print("Amount of Pushup : ");
        int pushup = scanner.nextInt();
                System.out.print("Amount of Situp : ");
        int situp = scanner.nextInt();
                System.out.print("Amount of Squat : ");
        int squat = scanner.nextInt();
        scanner.nextLine();
        Sport sport1 = new Sport(burpee, pushup, situp, squat);
        
        
        try(FileWriter writer = new FileWriter("log.txt")){
            
        writer.write("Amount of Burpee : " + sport1.getBurpee_number() +"\n");
        writer.write("Amount of Pushup : " + sport1.getPushup_number() +"\n");
        writer.write("Amount of Situp : " + sport1.getSitup_number() +"\n");
        writer.write("Amount of Squat : " + sport1.getSquat_number() +"\n");
        int i = 1;
        
        while(sport1.finish_sport() == false){
            System.out.print("Please choice one kind of Sport (Burpee,Pushup,Situp,Squat) : ");
            String kind = scanner.nextLine();
            System.out.print("How many : ");
            int amount = scanner.nextInt();
            scanner.nextLine();
            sport1.doing_sport(kind, amount);
            
            writer.write(i + ".Equation ------> Sport : " + kind +" Amount : " + amount + "\n");
            i++;
        }
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Concrulation. You finished sport program...");
    }
}
