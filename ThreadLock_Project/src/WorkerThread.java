
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class WorkerThread {

   Random random = new Random();
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    private Object lock1 = new Object();
    private Object lock2 = new Object();
    
    
    public void AddList1(){
        synchronized (lock1) {
            
        
       try {
           Thread.sleep(1);
       } catch (InterruptedException ex) {
           Logger.getLogger(WorkerThread.class.getName()).log(Level.SEVERE, null, ex);
       }
        list1.add(random.nextInt());
        }
    }
    public  void AddList2(){
        synchronized (lock2) {
            
        
       try {
           Thread.sleep(1);
       } catch (InterruptedException ex) {
           Logger.getLogger(WorkerThread.class.getName()).log(Level.SEVERE, null, ex);
       }
        list2.add(random.nextInt());
        }
        
    }
    
    public void WorkList(){
        for(int i = 0 ; i < 1000 ; i++){
            AddList1();
            AddList2();
        }
    }
    public void ThreadList(){
        
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                WorkList();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                WorkList();
            }
        });
        
        long start = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        
       try {
           thread1.join();
           thread2.join();
       } catch (InterruptedException ex) {
           Logger.getLogger(WorkerThread.class.getName()).log(Level.SEVERE, null, ex);
       }
       long end = System.currentTimeMillis();
       long time = end - start;
        System.out.println("List1 size : " +list1.size() + "\nList2 size : " + list2.size() +"\nTime : " + time);
        
    }
    
}
