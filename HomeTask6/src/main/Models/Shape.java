/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.Models;

/**
 *
 * @author Nijat
 */
public abstract class Shape {
    
    private String color;
    private boolean filled;

    public abstract void calculateArea();
    public void printDetails(){
        System.out.println("printDetails called by Shape class");
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }
    
  
    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
