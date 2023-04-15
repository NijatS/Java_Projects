
import java.util.Scanner;


public class Main {
   private static functions musician = new functions();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void showing(){
        musician.showing_musician();
    }
    public static void adding(){
        System.out.print("Enter the name : ");
        String name =scanner.nextLine();
        musician.adding_musician(name);
        
    }
    public static void removing(){
        System.out.print("Which index you want to remove : ");
        int index = scanner.nextInt();
        scanner.nextLine();
        musician.remove_musician(index-1);
    }
    public static void uploading(){
        System.out.print("Please enter which index you want to upload : ");
       int index = scanner.nextInt();
        scanner.nextLine();
        System.out.print("New name : ");
       String name = scanner.nextLine();
        musician.upload_musician(name, index-1);
    }
    public static void finding(){
        System.out.print("Please enter the name you want to find : ");
       String name = scanner.nextLine();
        musician.finding_musician(name);
    }
    
    
    public static void showing_equation(){
        System.out.print("Our equations : \n");
        System.out.print("1 . Showing Musicians\n");
        System.out.print("2 . Adding Musicians\n");
        System.out.print("3 . Removing Musicians\n");
        System.out.print("4 . Uploading Musicians\n");
        System.out.print("5 . Finding Musicians\n");
        System.out.println("6 . Closing Program\n");
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to Musician program");
        showing_equation();
        
        boolean a = false;
        int equation ;
        while( !a ){
            System.out.print("Please select one of these equations : ");
            equation = scanner.nextInt();
            scanner.nextLine();
            
            switch(equation){
                case 1 : 
                    showing();
                    break;
                case 2 :
                    adding();
                    break;

                case 3 :
                    removing();
                    break;
                case 4 :
                    uploading();
                    break;
                case 5:
                    finding();
                    break;
                case 6:
                    a = true;
                    System.out.println("Program is finished...");
                    break;
            }
        }
    }
}
