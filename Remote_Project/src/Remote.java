
import java.util.ArrayList;
import java.util.Iterator;


public class Remote implements Iterable<String>{
    
    private ArrayList<String> channel_list = new ArrayList<String>();
   
    public void AddChannel(String channel){
        
        channel_list.add(channel);
        System.out.println(channel + " is added");
    }
    
    public void RemoveChannel(String channel){
        if(channel_list.contains(channel)){
            System.out.println(channel + " is removed");
            channel_list.remove(channel);

        }
        else{
            System.out.println("There is not this channel...");
        }
    }
    public void ShowChannels(){
        if(channel_list.isEmpty()){
            System.out.println("There is not any channel...");
        }
        else{
            for(String s : channel_list){
                System.out.println(s);
            }
        }
         
     }
    public void SizeChannel(){
        System.out.println("Channel amount : " + channel_list.size());
    
    }
     class RemoteIterator implements Iterator<String>{
         private  int index = 0;

        @Override
        public boolean hasNext() {
            
            if(index > channel_list.size()){
                return false;
            }
            else{
                return true;
                
            }
        }

        @Override
        public String next() {
            String a = channel_list.get(index);
            index++;
            return a;
        }
         
         
         
     }

    @Override
    public Iterator<String> iterator() {
        return new RemoteIterator();
                
    }
    
    
}
