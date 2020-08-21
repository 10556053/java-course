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
public class Drink {
    String name;
    int price;
    int stock;
    
    //建構子
    public Drink(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    public Drink(String name){
        this.name = name;
    }
    void sell(int amount){
        stock-=amount;
    }
    @Override
    public String toString() {
        return "Drink{" + "name=" + name + ", price=" + price + ", stock=" + stock + '}';
    }
    
    
    
    
    
}
