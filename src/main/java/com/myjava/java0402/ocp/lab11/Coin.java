/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab11;

/**
 *
 * @author student
 */
enum USCurrency{
    PENNY(1),
    NICKLE(5),
    DIME(10),
    QUARTER(25);
    
    
    
    //注意!一定是private
    private int values;
    private USCurrency(int values){
        this.values = values;
    }    
    
    public int getValue(){
        return values;
    }
}

public class Coin {
    public static void main(String[] args) {
        
        //一定不能用new 
        USCurrency coin = USCurrency.DIME;
        
        System.out.println(coin.getValue()+"每分");
    }
}
