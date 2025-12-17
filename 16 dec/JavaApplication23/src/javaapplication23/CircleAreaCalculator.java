/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

/**
 *
 * @author RAJA KANNAN
 */
public class CircleAreaCalculator{
    
    
    public float calculate(){
        final int radius = 5;
        int radius = 9;
        float sum = 3.14f * radius * radius;
        return sum;
    }
    
    public static void main(String[] args) {
        CircleAreaCalculator c = new CircleAreaCalculator();
        System.out.println("square of circle: "+c.calculate());
        
    }
}
