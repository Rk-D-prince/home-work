/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

/**
 *
 * @author RAJA KANNAN
 */
public class Acer {
    String model;
    String colour;
    boolean rgb;
    String processor;
    int price;
    
    Acer(String model, String colour, boolean rgb, String processor, int price){
        this.model = model;
        this.colour = colour;
        this.rgb = rgb;
        this.processor = processor;
        this.price = price;
    }
    
    void display(){
        System.out.println("Laptop name: "+model);
        System.out.println("Color of the laptop: "+ colour);
        System.out.println("Is it rgb keyboard (True/ false): "+rgb);
        System.out.println("Processor: "+processor);
        System.out.println("Price of the laptop: "+ price);
    }
}
