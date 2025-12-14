/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;
import java.util.*;
/**
 *
 * @author RAJA KANNAN
 */
public class EndswithA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word: ");
        String word = sc.nextLine();
        
        if (word.charAt(word.length() - 1) == 'a') {
            System.out.println("Its ends with word a");
        } else {
            System.out.println("Its not ends with the word a");
        }
    }
}
