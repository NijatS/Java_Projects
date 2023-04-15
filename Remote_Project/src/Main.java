
import java.util.Scanner;


public class Main {
    
    
    public static void main(String[] args) throws InterruptedException {
        
        Scanner scanner = new Scanner(System.in);
         String equation ="1.Add Channel\n"
                 + "2.Remove Channel\n"
                 + "3.Show Channels\n"
                 + "4.Channel amount\n"
                 + "Exit with 'q'";
         System.out.println(equation);
         
         Remote remote = new Remote();
         
         
       while(true){
           //Thread.sleep(1000);
           System.out.print("Please enter equation number : ");
           String e = scanner.nextLine();
           
           if(e.equals("q")){
               System.out.println("Exiting the program...");
               Thread.sleep(3000);
               break;
           }
           else if(e.equals("1")){
               System.out.print("Which channel do you want to add : ");
               String add = scanner.nextLine();
               Thread.sleep(3000);
               remote.AddChannel(add);
           }
           else if(e.equals("2")){
               System.out.print("Which channel do you want to remove : ");
               String remove = scanner.nextLine();
               Thread.sleep(3000);
               remote.RemoveChannel(remove);
           }
           else if(e.equals("3")){
               Thread.sleep(3000);
               remote.ShowChannels();
           }
           else if(e.equals("4")){
               remote.SizeChannel();
           }
           else{
               System.out.println("Error...Please enter correct equation number..");
           }
       }
    }
}  
