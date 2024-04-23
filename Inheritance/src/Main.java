
import entity.Person;
import entity.Programmer;


public class Main {

    public static void main(String[] args) {
        
        Programmer programmer1 = new Programmer(3);
        Person programmer2 = new Programmer(2);
        
        programmer1.setId(1);
        programmer1.setName("Nijat");
        programmer1.setAge(20);
        programmer1.setProgLan("C#");
        programmer1.setExp(1);
        
        System.out.println(programmer1.toString());
        programmer1.greeting();
        programmer1.PerformTask();
    
    }
    
}
