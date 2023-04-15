
import javax.swing.JFrame;


public class MainDisplay extends JFrame{
    
    
    
    public static void main(String[] args) {
        
        UsingGraphics graphics = new UsingGraphics();
        
        MainDisplay display = new MainDisplay();
        
        display.setVisible(true);
        
        display.setResizable(true);
        
        display.setSize(800, 600);
        
        display.setLocation(500, 200);
        
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        display.add(graphics);
    }
}
