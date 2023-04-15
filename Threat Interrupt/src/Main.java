
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    
    
    public static void main(String[] args) {
        
        List<Integer> list = new LinkedList<>();
        
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                
                System.out.println("Thread start to work..");
                
                for(int i = 0; i < 1000000000 ; i++){
                    
                    if(Thread.currentThread().isInterrupted()){
                        System.out.println("Thread sleep forever..");
                        return;
                    }
                    
                    list.add(i);
                    

                    
                }
                    System.out.println("Thread stop its work...");
            }
        });
        
        thread.start();
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        thread.interrupt();
        
    }
    
}
