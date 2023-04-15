
import java.util.Scanner;



public class Project {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Input First Number : ");
        double a=scan.nextDouble();
        System.out.print("Input Second Number : ");
        double b=scan.nextDouble();
        
        double c;
        c=a;
        a=b;
        b=c;
        System.out.println("After Changing ");
        System.out.println("First Number : " + a);
        System.out.println("Second Number : " + b);
}
}
