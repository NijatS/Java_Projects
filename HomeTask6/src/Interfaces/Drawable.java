/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author Nijat
 */
public interface Drawable {
    public abstract void draw();
    private void setupDrawing(){
        System.out.println("private method setupDrawing");
    }
    default void defaultDraw(){
        System.out.println("default method defaultDraw");
    }
    
}
