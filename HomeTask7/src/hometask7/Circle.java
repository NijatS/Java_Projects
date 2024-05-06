/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hometask7;

/**
 *
 * @author Nijat
 */
public class Circle extends Shape {
    public static int id = 1;

    

    @Override
    public void compareObjDetail(Shape shape) {
                System.out.println("Cirlce");

        super.compareObjDetail(shape); 
    }

    @Override
    public void printDetail() {
          System.out.println("Cirlce");

        super.printDetail(); 
    }
    
    public Circle(String name, String color) {
        super(name, color);
    }
    
}
