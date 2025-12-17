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
public class Square {
    int num;
    
    public static int square(int n){
    int res = n*n;
    return res;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Square s = new Square();
        System.out.println(Square.square(3));
    }
    
}
