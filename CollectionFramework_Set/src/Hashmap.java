
import java.util.HashMap;
import java.util.Map;


public class Hashmap {
    
    public static void main(String[] args) {
        
        HashMap<Integer,String> hashmap = new HashMap<Integer,String>();
        
        hashmap.put(10, "Java");
        hashmap.put(100, "C++");
        hashmap.put(30, "Python");
        hashmap.put(50, "C#");
        
        for(Map.Entry<Integer,String> map : hashmap.entrySet()){
        
            System.out.println("Key : " + map.getKey() +" Value : " + map.getValue());
        
    }
        
    }
}
