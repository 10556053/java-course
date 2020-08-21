/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab06;

/**
 *
 * @author student
 */
public class Machine {
    String name="我是機器";
    private void noAccess(){
        System.out.println("我不能被繼承");
    }
    void power(){
        System.out.println("我吃電");
    }
    void playMachine(){
        System.out.println("我會動");
    }
}
