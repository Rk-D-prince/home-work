/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author RAJA KANNAN
 */

class Device{
    void powerOn(){
       
    }
}

class Mobile extends Device{
    @Override
    void powerOn(){
       System.out.println("Mobile is now ON");
    }
}

class Laptop extends Device{
    @Override
    void powerOn(){
        System.out.println("Laptop is booting up");
    }
}
public class SmartDevicesMain {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.powerOn();
        
        Laptop l = new Laptop();
        l.powerOn();
    }
}
