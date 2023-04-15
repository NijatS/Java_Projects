
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SemaphoreWork {
    private Semaphore sem = new Semaphore(3);
    
    
    public void ThreadWork(int Id){
        try {
            sem.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(SemaphoreWork.class.getName()).log(Level.SEVERE, null, ex);
        }
       System.out.println("Thread " + Id + " work...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SemaphoreWork.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
        
        System.out.println("Thread  " + Id + " closing...");
        sem.release();
        
    }
    
}
