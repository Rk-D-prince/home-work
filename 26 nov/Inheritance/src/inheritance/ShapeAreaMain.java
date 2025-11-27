/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author RAJA KANNAN
 */

class Shape{
    int radius;
    int length;
    int width;
    
    Shape(int radius, int length, int width){
        this.radius = radius;
        this.length = length;
        this.width = width;
    }
    void printArea(){
    
    }
}

class Circle extends Shape{
    Circle(int radius){
    super(radius, 0, 0);
    }
    
    @Override
    void printArea(){
        float ans = 3.14f * radius * radius;
        System.out.println("Area of Circle: "+ans);
    }  
}

class Rectangle extends Shape{
    Rectangle(int length, int width){
    super(0, length, width);
    }
    
    @Override
    void printArea(){
        int ans = length * width;
        System.out.println("Area of Rectangle: "+ans);
    }  
}

public class ShapeAreaMain {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.printArea();
        
        Rectangle r = new Rectangle(4, 6);
        r.printArea();
    }
}
