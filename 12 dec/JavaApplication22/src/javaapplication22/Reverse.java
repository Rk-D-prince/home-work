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
public class Reverse {
    public String sample(String word){
        int start = 0;
        int end = word.length()-1;
        char[] ch = word.toCharArray();
        while(start<end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return new String(ch);
    }
    
    public static void main(String[] args){
        Reverse r = new Reverse();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word: ");
        String word = sc.nextLine();
        String res = r.sample(word);
        System.out.println("Reversed word: "+res);
        
    }
}
