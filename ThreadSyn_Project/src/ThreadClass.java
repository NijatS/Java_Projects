
import java.util.logging.Level;
import java.util.logging.Logger;



public class ThreadClass{
        private int count = 0;
        
        public synchronized void totalCount(){
           count++;
        }
        
       public void Working(){
           Thread thread1 = new Thread(new Runnable() {
               @Override
               public void run() {
                   
                   for(int i = 0 ; i<5000; i++){
                       totalCount();
                   }
               }
           });
           Thread thread2 = new Thread(new Runnable() {
               @Override
               public void run() {
                   
                   for(int i = 0 ; i<5000; i++){
                       totalCount();
                   }
               }
           });
           
           thread1.start();
           thread2.start();
           
            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadClass.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           
           System.out.println("Count : " + count);
           
       }
        
    
    public static void main(String[] args) {
        
        ThreadClass thread = new ThreadClass();
        thread.Working();
        
        
        
    }
    
}
