
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProducerConsumer {
    
    Random random = new Random();
    Queue<Integer> queue = new LinkedList<Integer>();
    int limit  = 10;
    Object key = new Object();
    
    public void Produce(){
        while(true){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
        }
        synchronized (key) {
            
        if(queue.size() == limit){
            
            try {
                key.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
        
        int value = random.nextInt(100);
        queue.offer(value);
            System.out.println("Producer produces : " + value);
            
            key.notify();
        } 
    }
    }
    public void Consume(){
        while(true){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
        }
            synchronized (key) {
                
                if(queue.isEmpty()){
                    try {
                        key.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                System.out.println("Queue Size : "  + queue.size());
                int value = queue.poll();
                System.out.println("Consumer consume : " + value);
                key.notify();
            }
       
        
        }  
        
    }
    
    
}
