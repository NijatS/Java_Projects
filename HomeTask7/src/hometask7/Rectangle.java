/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hometask7;

/**
 *
 * @author Nijat
 */
public class Rectangle  extends Shape{
    private static int id = 2;

    @Override
    public void compareObjDetail(Shape shape) {
        System.out.println("Rectangle");
        super.compareObjDetail(shape); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void printDetail() {
       System.out.println("Rectangle");

        super.printDetail(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    public Rectangle(String name, String color) {
        super(name, color);
    }
    
}
