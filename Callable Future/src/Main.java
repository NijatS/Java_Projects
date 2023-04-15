
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    
    public static void main(String[] args) {
        
        
        ExecutorService executor = Executors.newFixedThreadPool(2);
        
        Future<?> future = executor.submit(new Callable<Integer>(){
            @Override
            public Integer call() throws Exception {
                
                Random random = new Random();
                
                int time = random.nextInt(1000)+2000;
                System.out.println("Thread start to work....");
                Thread.sleep(time);
                
                System.out.println("Thread stoping...");
                
                return time;
            }
            
            
        
    });
        executor.shutdown();
        
        try {
            System.out.println("Time for sleeping : " + future.get());
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
