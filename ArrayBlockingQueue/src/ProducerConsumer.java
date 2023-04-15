
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProducerConsumer {
    
    Random random = new Random();
    BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
    
    
    public void Produce(){
        while(true){
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        try {
            int value = random.nextInt(100);
            System.out.println("Producer put :" + value);
            queue.put(value);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }
    public void Consume(){
        while(true){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        try {
            int value = queue.take();
            System.out.println("Consumer take : " +value);
            System.out.println("Size of queue : " + queue.size());
        } catch (InterruptedException ex) {
            Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        }
    }
    
}
