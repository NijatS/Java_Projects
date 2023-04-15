
import java.util.*;


public class Main {
    static class Player implements Comparable<Player>{
        private int id;
        private String name;

        public Player(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "ID : " + id + "  Name : " + name;
        }

        @Override
        public int compareTo(Player player) {
            
            if(this.id > player.id){
                return 1;
            }
            else if(this.id < player.id){
                return -1;
            }
            return 0;
        }
        
        
        
        
        
    }
    
    
    public static void main(String[] args) {
        
        List<Player> list_player = new ArrayList<Player>();
        
        list_player.add(new Player(1 , "Nijat"));
        list_player.add(new Player(10 , "Farid"));
        list_player.add(new Player(50 , "Jeyhun"));
        list_player.add(new Player(5 , "Murad"));
        list_player.add(new Player(20 , "Rahim"));
        
        Collections.sort(list_player);
        
        for(Player s : list_player){
            System.out.println(s);
        }
        
        
    }
    
}
