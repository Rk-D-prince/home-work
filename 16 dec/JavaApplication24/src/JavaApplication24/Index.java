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
public class Index {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int index = 5;
        
        try {
            System.out.println("Value in that index: "+arr[index]);
        }
        catch (Exception e){
            System.out.println("Array out of index");
        }
    }
}
