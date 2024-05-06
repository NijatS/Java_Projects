/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hometask7;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Nijat
 */
public class Shape {
    public static int id = 0;
    private String _name;
    private String _color;
    
    
    public Shape(String name , String color){
        _name = name;
        _color = color;
    }
    public void printDetail(){
        System.out.println(toString());
    }
    
    public void compareObjDetail(Shape shape){
        System.out.println(toString());
        System.out.println(shape.toString());
        
    }
    
    public static Shape getShapeByName(List<Shape> shapes,String name){
         
        for(Shape shape:shapes){
            
            if(shape._name.equals(name)){
                return shape;
            }
        }
        return null;
    }
    
    public static List<Shape> getShapeListByColor(List<Shape> shapes,String color){
        
        List<Shape> findedList = new ArrayList<Shape>();
         for(Shape shape:shapes){
            
            if(shape._color.equals(color)){
                findedList.add(shape);
            }
        }
         return findedList;
    }

    @Override
    public  String toString() {
        return getClass().getSimpleName() + " Id="+id+ "  Name=" + _name + ", Color=" + _color ;
    }

  
    
    
    
    
}
