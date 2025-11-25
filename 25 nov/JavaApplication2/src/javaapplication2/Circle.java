/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author RAJA KANNAN
 */
public class Circle {
    int radius;
    float area;
    
    Circle(int radius){
        this.radius = radius;
        area = (float)3.14 * radius * radius;
    }
    
    void showArea(){
        System.out.print("Area of Circle is: "+area);
    }
}
