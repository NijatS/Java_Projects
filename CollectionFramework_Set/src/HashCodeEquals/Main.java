
package HashCodeEquals;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class Main {
    static class Player{
        private int id;
        private String name;

        public Player(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "ID : " + id + " Name : " + name;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 29 * hash + this.id;
            hash = 29 * hash + Objects.hashCode(this.name);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Player other = (Player) obj;
            if (this.id != other.id) {
                return false;
            }
            return Objects.equals(this.name, other.name);
        }
        
        
        
    }
    
    public static void main(String[] args) {
        
        
        Set<Player> set1 = new HashSet<Player>();
        
        Player p1 = new Player(1, "Nijat");
        Player p2 = new Player(2, "Jeyhun");
        Player p3 = new Player(3, "Ugur");
        Player p4 = new Player(1, "Nijat");
        
        set1.add(p1);
        set1.add(p2);
        set1.add(p3);
        set1.add(p4);
        
        for(Player s : set1){
            System.out.println(s);
        }
        
    }
}
