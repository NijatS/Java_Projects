
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ReentrantLockClass {
    private int amount = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    
    public void Add(){
        
        for(int i = 0; i < 10000 ; i++){
            amount++;
        }
    }
    
    public void Thread1func(){
        lock.lock();
        System.out.println("Thread 1 is working...");
        
        System.out.println("Thread 1 wait Thread 2");
        try {
            condition.await();
        } catch (InterruptedException ex) {
            Logger.getLogger(ReentrantLockClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        Add();
        System.out.println("Thread 1 is working again");
        lock.unlock();
        
    }
    public void Thread2func(){
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ReentrantLockClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        lock.lock();
        System.out.println("Thread 2 is working...");
        
        condition.signal();
        
        Add();
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ReentrantLockClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        lock.unlock();
        
    }
    
    public void TotalAmount(){
        System.out.println("Total amount : " + amount);
    }
}
