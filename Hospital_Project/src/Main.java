
import java.util.PriorityQueue;
import java.util.Queue;


public class Main {
    
    public static void main(String[] args) {
        
        
        Queue<Patient> hospital_service = new PriorityQueue<Patient>();
        hospital_service.offer(new Patient("Nijat Soltanov","Apendisit"));
        hospital_service.offer(new Patient("Fariz Salimov","Tezyiq"));
        hospital_service.offer(new Patient("Kamil Aliyev","Apendisit"));
        hospital_service.offer(new Patient("Sima Amirov","Yaniq"));
        hospital_service.offer(new Patient("Murad Babayev","Yaniq"));
        hospital_service.offer(new Patient("Jeyhun Quliyev","Apendisit"));
        
        int i = 1;
        while(!hospital_service.isEmpty()){
            System.out.println(i + " " +hospital_service.poll());
            i++;
        }
    }
    
}
