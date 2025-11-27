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

class Player{
    String name;
    Player(String name){
        this.name = name;
    }
    
    void play(){
    
    }
}

class CricketPlayer extends Player{
    CricketPlayer(String name){
        super(name);
    }
    void play(){
        System.out.println(name+" hits a six!");
    }
}

class FootballPlayer extends Player{
    FootballPlayer(String name){
        super(name);
    }
    void play(){
        System.out.println(name+" scores a goal!");
    }
}



public class PlayerMain {
    public static void main(String[] args) {
        CricketPlayer c = new CricketPlayer("Dhoni");
        c.play();
        
        FootballPlayer f = new FootballPlayer("Messi");
        f.play();
    }
}
