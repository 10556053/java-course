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
public class Product {
    //未設定static之前，兩個不同的惡建用的stock都是分別開來的
    
    static int stock;
    void sell(int amount){
        stock-= amount;
    }
    
    void buy(int amount){
        stock+=amount;
    }
}
