/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab20;

/**
 *
 * @author student
 */
public class RaceDemo {
    public static void main(String[] args) {
        Race race2 = new Race("烏龜");
        Race race1 = new Race("兔子");
        
        RaceHelper helper = new RaceHelper("陪跑的");
        
        race1.start();
        race2.start();
        helper.start();
        
    }
}
