
import java.util.Scanner;


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
        
        while(sport1.finish_sport() == false){
            System.out.print("Please choice one kind of Sport (Burpee,Pushup,Situp,Squat) : ");
            String kind = scanner.nextLine();
            System.out.print("How many : ");
            int amount = scanner.nextInt();
            scanner.nextLine();
            sport1.doing_sport(kind, amount);
        }
        System.out.println("Concrulation. You finished sport program...");
    }
}
