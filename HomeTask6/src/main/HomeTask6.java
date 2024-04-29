/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import main.Models.Circle;
import main.Models.Rectangle;




public class HomeTask6 {
    
    
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        
        circle1.setColor("red");
        circle1.setFilled(true);
        circle1.calculateArea();
        circle1.printDetails();
        circle1.resize(10);
        circle1.defaultResize();
        
        System.out.println(circle1.getColor());
        System.out.println(circle2.getColor());
        
        rectangle1.calculateArea();
        rectangle1.printDetails();
        rectangle1.draw();
        rectangle1.defaultDraw();
        
    }
    
}
