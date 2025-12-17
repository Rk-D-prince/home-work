/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication24;
import java.util.*;

public class ThrowandThrows {
    
    public static void check(int num) throws Exception{
        if(num>0){
            System.out.println("Number is positive");
        }
        else{
            throw new Exception("Number should not be negative");
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        
        try {
            check(num);
        }
        catch (Exception e){
            System.out.println("Error "+ e.getMessage());
        }
    }
}
