/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.Models;

import Interfaces.Drawable;

/**
 *
 * @author Nijat
 */
public class Rectangle extends Shape  implements Drawable {

    @Override
    public void calculateArea() {
        System.out.println("Rectangle run Area method");
    }

    @Override
    public void draw() {
        System.out.println("draw run by Rectangle");
    }
    

    @Override
     public void defaultDraw(){
        System.out.println("default run by Rectangle");
    }
}
