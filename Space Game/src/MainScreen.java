
import java.awt.HeadlessException;
import javax.swing.JFrame;


public class MainScreen extends  JFrame{

    public MainScreen(String string) throws HeadlessException {
        super(string);
    }
    
    
    public static void main(String[] args) {
        
        MainScreen ms = new MainScreen("Space Game");
        ms.setResizable(false);
        
        ms.setFocusable(false);
        
        ms.setSize(800, 600);
        
        ms.setLocation(500, 200);
        
        ms.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Game game = new Game();
        
        game.requestFocus();
        
        game.addKeyListener(game);
        
        game.setFocusable(true);
        
        game.setFocusTraversalKeysEnabled(false);
        
        ms.add(game);
        
        ms.setVisible(true);
        
        
    }
    
}
