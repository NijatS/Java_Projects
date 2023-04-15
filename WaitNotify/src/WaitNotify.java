
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class WaitNotify {
    Object lock = new Object();
    
    
    public void Thread1Func(){
        synchronized (lock) {
            System.out.println("Thread 1 begin to work...");
            System.out.println("Thread 1 wait Thread 2");
            
            try {
                lock.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            System.out.println("Thread 1 work again...");
            
            
        }
        
    }
    
    public void Thread2Func(){
        
        synchronized (lock) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Thread 2 begin to work...");
            System.out.println("If you want to continue, press to any button");
            scanner.nextLine();
            
            lock.notify();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
            }
                    
        }
        
        
    }
}
