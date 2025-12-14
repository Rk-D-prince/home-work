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
public class Palindrome {
    public String sample(String word){
        char[] ch = word.toCharArray();
        int start = 0;
        int end = word.length()-1;
        
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
        Palindrome r = new Palindrome();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word: ");
        String word = sc.nextLine();
        String res = r.sample(word);
        
        if(res.equals(word)){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }
    }
}
