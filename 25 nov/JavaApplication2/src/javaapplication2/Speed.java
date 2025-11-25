/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author RAJA KANNAN
 */
public class Speed {
    int speed;
    int distance;
    int time;
   
    
    Speed(int distance, int time){
        this.distance = distance;
        this.time = time;
        speed = distance/time;
    }
    
    void printSpeed(){
        System.out.print(" Speed :"+speed+"Km/Hr");
    }
}
