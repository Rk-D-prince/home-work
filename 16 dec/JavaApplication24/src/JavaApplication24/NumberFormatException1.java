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
public class NumberFormatException1 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number: ");
    String input = sc.nextLine();
    try {
        int num = Integer.parseInt(input);
    }
    catch (NumberFormatException n){
        System.out.println("Invalid input! Please enter numeric data only.");
    }
    
    }
}
