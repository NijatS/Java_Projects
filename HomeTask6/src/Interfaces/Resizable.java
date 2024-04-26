/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author Nijat
 */
public interface Resizable {
    public abstract void resize(double factor);
    default void defaultResize(){
        System.out.println("defaultResize is called");
    }
}
