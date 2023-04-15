

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JOptionPane;


import javax.swing.JPanel;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CP
 */
class Ates{
        private int x ;
        private int y;

        public Ates(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
        
        
        
    }

public class Game extends JPanel implements KeyListener,ActionListener{
    
    Timer timer = new Timer(1,this);
    
    
    
    private BufferedImage picture ;
    
    private int kecenvaxt = 0;
    
    private int ates = 0 ;
    
    private int spaceshipX = 0;
    
    private int spaceshipmove = 20;
    
    private ArrayList<Ates> ates_list = new ArrayList<Ates>();
    
    private int topX = 0;
    
    private int topXmove = 5;
    
    private int atesYmove = 3;
    
    public boolean check(){
        
        for(Ates ates : ates_list){
            
            if(new Rectangle(ates.getX(), ates.getY(), 10, 20).intersects(new Rectangle(topX,0,20,20))){
                return  true;
            }
        }
        return  false;
    }
    public Game() {
        
        try {
            picture = ImageIO.read(new FileImageInputStream(new File("uzaygemisi.png")));
        } catch (IOException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        setBackground(Color.black);
        
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
         kecenvaxt += 5;
        g.setColor(Color.red);
        
        g.fillOval(topX, 0, 20, 20);
        
        g.drawImage(picture, spaceshipX, 490, picture.getWidth()/10, picture.getHeight()/10, this);
        
        timer.start();
        
        
        g.setColor(Color.blue);
        for(Ates ates : ates_list){
            if(ates.getY() <= -10){
                ates_list.remove(ates);
            }
        g.fillRect(ates.getX(), ates.getY(), 10, 20);
        }
        
        check();
        
        if(check()){
            timer.stop();
            String message = "Congratulations..."
                    +"\nAmount of shot : " + ates
                    +"\nTime : "+ kecenvaxt / 1000.0 +" san" ;
            
            JOptionPane.showMessageDialog(this, message);
            
            System.exit(0);
        }
    }

    @Override
    public void repaint() {
        super.repaint(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
            

    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        int c = e.getKeyCode();
        
        if(c == KeyEvent.VK_A  || c == KeyEvent.VK_LEFT){
             if(spaceshipX <= 0){
                 spaceshipX = 0;
             }
             else{
                 spaceshipX -= spaceshipmove;
             }
        }
        else if(c == KeyEvent.VK_D || c == KeyEvent.VK_RIGHT){
             if(spaceshipX >= 750 ){
                 spaceshipX = 750;
             }
             else{
                 spaceshipX += spaceshipmove;
             }
        }
        
        else if(c == KeyEvent.VK_W || c == KeyEvent.VK_UP || c == KeyEvent.VK_CONTROL){
            ates_list.add(new Ates(spaceshipX + 15,470));
            ates++;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(Ates ates : ates_list){
            
            ates.setY(ates.getY() - atesYmove);
        }
        
        topX += topXmove;
        
        if( topX >= 780){
            topXmove = -topXmove;
        }
        if( topX <= 0){
            topXmove = -topXmove;
        }
        repaint();
    }

}
