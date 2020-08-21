/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab12;

/**
 *
 * @author student
 */
public class MyCoin {
    private int money;

    public MyCoin(int momo) {
        this.money = momo;
    }
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    

    @Override
    public String toString() {
        return "MyCoin{" + "money=" + money + '}';
    }
    
}
