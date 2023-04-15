
//import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Iterator;


public class Radio implements Iterable<String>{
    
    private ArrayList<String> channel_list = new ArrayList<String>();
    
    
    public Radio(String[] channels ){
        for(String channel : channels){
            channel_list.add(channel);
        }
    }
    
    public class RadioIterator implements Iterator<String>{
    
        private int index = 0;
        @Override
        public boolean hasNext() {
            if(index < channel_list.size()){
                return true;
            }
            else{
                return  false;
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
        return new RadioIterator();
    }
}
