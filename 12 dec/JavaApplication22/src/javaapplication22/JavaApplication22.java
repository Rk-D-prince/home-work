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
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word: ");
        String s = sc.nextLine();
        
        int vowelCount = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowelCount += 1;
            }
        }
        System.out.println("Vowel count: "+vowelCount );
    }
    
}
