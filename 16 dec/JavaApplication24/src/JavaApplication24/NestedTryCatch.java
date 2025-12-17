/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication24;
import java.util.*;
/**
 *
 * @author RAJA KANNAN
 */
public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int a = sc.nextInt();
        System.out.println("enter number: ");
        int b = sc.nextInt();
        int[] arr = {1,2,3,4,5};
        
        try {
            try {
                int c = a/b;
                System.out.println("Result: "+c);
            }
            catch (ArithmeticException e){
                System.out.println("ArithmeticException for division by zero.");
            }
            System.out.println("enter number: ");
            int index = sc.nextInt();
            System.out.println("Value in that index: "+arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException d){
            System.out.println("Out of index");
        }
    }
}
