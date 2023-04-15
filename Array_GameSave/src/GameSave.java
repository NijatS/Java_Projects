
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GameSave {
    
    
    
    public static void GameSaving(Card[][] card){
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("save.bin"))){
            
            System.out.println("Saving Game....");
            out.writeObject(card);
            
        } catch (IOException ex) {
            Logger.getLogger(GameSave.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Card[][] UseSaving(){
        
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("save.bin"))){
            
            Card[][] save = (Card[][])in.readObject();
            return save;
            
        } catch (IOException ex) {
            Logger.getLogger(GameSave.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GameSave.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
      
        
    }


