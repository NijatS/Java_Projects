/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.Models;

import Interfaces.Resizable;

/**
 *
 * @author Nijat
 */
public class Circle extends Shape  implements Resizable{

    @Override
    public void calculateArea() {
        System.out.println("Circle run Area method");
    }

    @Override
    public void resize(double factor) {
        System.out.println("Circle run ResizeMethod");
    }
    

    @Override
    public void defaultResize() {
        System.out.println("Circle run DeafultResizeMethod");
    }
    
}
