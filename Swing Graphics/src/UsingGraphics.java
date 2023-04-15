
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;



public class UsingGraphics extends  JPanel{

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        
        g.setColor(Color.red);
        
        g.fillRect(300, 300, 100, 100);
        
    }
    
    
    
    public UsingGraphics(){
        setBackground(Color.black);
        
    }
}
