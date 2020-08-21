/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab07;

/**
 *
 * @author student
 */
public class GameDemo {
    public static void main(String[] args) {
        Game g1 = Game.getInstance();
        Game g2 = Game.getInstance();
        Game g3 = Game.getInstance();
        
        g1.start();
        g2.start();
        g3.start();
    }
            
}
