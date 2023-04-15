
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.text.StyleContext;


public class Main {
    static class Player{
        private int id;
        private String name;

        public Player(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Player{" + "id=" + id + ", name=" + name + '}';
        }
    }
    static class Small_Large implements Comparator<Player>{

        @Override
        public int compare(Player o1, Player o2) {
            if(o2.getId() < o1.getId()){
                return 1;
            }
            else if(o2.getId() > o1.getId()){
                return -1;
            }
            return 0;
        }
        
    }
    static class Small_Large_Name implements Comparator<Player>{

        @Override
        public int compare(Player o1, Player o2) {
            return o1.getName().compareTo(o2.getName());
        }
        
    }
    
    
    public static void main(String[] args) {
        
        List<Player> list_player = new ArrayList<Player>();
        list_player.add(new Player(1,"Nijat"));
        list_player.add(new Player(7,"Nihad"));
        list_player.add(new Player(10,"Jeyhun"));
        list_player.add(new Player(5,"Abbbas"));
        
        Collections.sort(list_player,new Small_Large_Name());
        
        for(Player s: list_player){
            System.out.println(s);
    }
        Collections.sort(list_player, new Comparator<Player>(){
            @Override
            public int compare(Player o1, Player o2) {
                return -o1.getName().compareTo(o2.getName());
           }
          
        });
        System.out.println("*********************");
        for(Player s: list_player){
            System.out.println(s);
    }
                Collections.sort(list_player,new Small_Large());
         System.out.println("*********************");
        for(Player s: list_player){
            System.out.println(s);
    }
        Collections.sort(list_player, new Comparator<Player>(){
            @Override
            public int compare(Player o1, Player o2) {
                if(o2.getId() > o1.getId()){
                return 1;
            }
            else if(o2.getId() < o1.getId()){
                return -1;
            }
            return 0;
            }
            
            
        });
                System.out.println("*********************");
        for(Player s: list_player){
            System.out.println(s);
    }
        
}
}
