
package unilesson1;

import java.util.Scanner;
import unilesson1.additional.Manager;

public class Main {

  
    public static void main(String[] args) {
        Person p  = new Person();
        p.age = 22;
        p.name = "Nijat";
        Person.groupNumber = 99;
        
        //System.out.println("Person: " +p.name+"  Age: " + p.age );
        System.out.println(p.toString());
        
        Person p2 = new Person(20);
        p2.name = "Nicat";
        
        System.out.println(p2.toString());
        
        p2.groupNumber = 30;
        System.out.println(p.groupNumber+" "+ p2.groupNumber);
               
        Manager manager = new Manager();
        manager.id = 1;
        manager.name = "Ilham";
        System.out.println(manager.toString());
        
        Manager manager2 = new Manager();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Id: ");
        manager2.id = scan.nextInt();
        System.out.print("Name: ");
        manager2.name = scan.next();
        
        System.out.println(manager2.toString());
        
    }
    
}
