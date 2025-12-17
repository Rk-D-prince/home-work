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
public class MultipleExceptions {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int[] arr = {1,2,3,4,5};
        try {
            int index = a/b;
            int res = arr[index];
            System.out.println("Value in thet index: "+res);
        }
        
        catch (ArithmeticException c){
            System.out.println("ArithmeticException for division by zero.");
        }
        
        catch (ArrayIndexOutOfBoundsException d){
            System.out.println("ArrayIndexOutOfBoundsException for invalid array access.");
        }
    }
}
