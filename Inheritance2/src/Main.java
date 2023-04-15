
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Worker system...");
        String equation = "1. Manager equations\n"
                + "2. Developer equations\n"
                + "If you want to exit , please press to 'q' ";
        System.out.println("*******************");
        System.out.println(equation);
        System.out.println("*******************");
        
        while(true){
            System.out.print("Please select equation : ");
            String equation1 = scanner.nextLine();
            if(equation1.equals("q")){
                System.out.println("Exiting the program...");
                break;
            }
            else if(equation1.equals("1")){
                String equation_m = "1.Raising money\n"
                        + "2.Information\n"
                        + "If you want to exit , please press to 'q'";
                System.out.println(equation_m);
                Manager manager = new Manager("Jeyhun", "Quliyev", 2000, "0557453534", 10);
                while(true){
                    System.out.print("Please selecet equation : ");
                    String em = scanner.nextLine();
                    if(em.equals("q")){
                        System.out.println("Exiting the manager program...");
                        break;
                    }
                    else if(em.equals("1")){
                        System.out.print("How much money do you want to raise :");
                        int extra = scanner.nextInt();
                        scanner.nextLine();
                        manager.Extra(extra);
                    }
                    else if(em.equals("2")){
                        manager.Showing();
                    }
                    else{
                        System.out.println("Please enter correct equation");
                    }
                }
            }
            else if(equation1.equals("2")){
                String equation_d ="1.Operating system\n"
                        + "2.Information\n"
                        + "If you want to exit , please press to 'q'";
                System.out.println(equation_d);
                Developer developer = new Developer("Nijat", "Soltanov", 1500, "0706139013", "C++,Java,Python");
                while (true){
                    System.out.print("Please select equation : ");
                    String ed = scanner.nextLine();
                   
                    if(ed.equals("q")){
                        System.out.println("Exiting the developer program...");
                        break;
                }
                    else if(ed.equals("1")){
                        System.out.print("Which Operating System : ");
                        String os = scanner.nextLine();
                        developer.OS(os);
                    }
                    else if(ed.equals("2")){
                        developer.Showing();
                    }
                    else{
                        System.out.println("Please enter correct equation ...");
                    }
            }
            }
            else{
                System.out.println("Please enter correct equation ..");
            }
        }
    }
}
