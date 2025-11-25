/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author RAJA KANNAN
 */
public class Discount {
    int original;
    int discount;
    int price;
    
    Discount(int original, int discount){
        this.original = original;
        this.discount = discount;
        int Amount = (original * discount)/100;
        this.price = original - Amount;
    }
    
    void printFinalPrice(){
        System.out.print("Final price: Rs."+price);
    }
}
