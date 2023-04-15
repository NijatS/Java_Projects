
import java.util.logging.Level;
import java.util.logging.Logger;




public class Worker implements Runnable{
    
    private String name;
    private int taskID;

    public Worker(String name, int taskID) {
        this.name = name;
        this.taskID = taskID;
    }
    
    

    @Override
    public void run() {
        System.out.println("Worker " + name + " doing this work : "+taskID );
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Work " + taskID + " is finished ");
    }
    
}
