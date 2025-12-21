/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;
import java.util.*;
/**
 *
 * @author RAJA KANNAN
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> values = new ArrayList<>();
        int sum = 0;
        
        while(true){
            System.out.println("Enter 1 for entry || 2 for exit");
            int input = sc.nextInt();
        
            if(input==1){
                System.out.println("Enter a number: ");
                int val = sc.nextInt();
                values.add(val);
                }
            else{
                break;
            }
        }
    
        for(int value: values){
                sum += value;
            }
        System.out.println("Sum of number: "+sum);
    }
    
}
