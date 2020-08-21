/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab08;

/**
 *
 * @author student
 */
public class Shiba implements Dog{

    @Override
    public void eat() {
        System.out.println("骨頭");
    }

    @Override
    public void skill() {
        System.out.println("咬骨頭");
    }
    
}
