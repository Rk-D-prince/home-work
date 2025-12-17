/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication24;

/**
 *
 * @author RAJA KANNAN
 */
public class Divide {

        
    
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int res = a/b;
            System.out.println("Result: "+res);
        }
        catch (Exception e){
            System.out.println("divide by zero is not valid");
        }
    }
    
}
