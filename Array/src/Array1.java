
import java.util.Arrays;
import java.util.Scanner;


public class Array1 {
    public static int[] array_enter(int number){
        Scanner scanner = new Scanner(System.in);
        int[] b = new int[number];
        for(int i = 0; i < number ;i ++){
            b[i] = scanner.nextInt();
    }
        return b;
    }
    public static void showing(int [] a){
        System.out.print("Array :");
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(" " + a[i]);
        }
    }
    public static void sorting(int[] a){
        Arrays.sort(a);
        showing(a);
    }
    public static void main(String[] args) {
        int[] a = array_enter(5);
       
        sorting(a);
        
    }
}
