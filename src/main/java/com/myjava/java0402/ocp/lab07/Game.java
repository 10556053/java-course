/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab07;

import java.util.Random;

/**
 *
 * @author student
 */
//假設一個物件建立成本龐大，但又要多次使用
//可以以private自記先行建立
//別的城市無法自行新建物件
//只能用Game提供的getxx方法獲得
public class Game {
    int serialNum = new Random().nextInt();
    private static Game _instancGame = new Game();
    
    private Game(){
    }
    
    public static Game getInstance(){
        return  _instancGame;
    }
    public void start(){
        System.out.println("開始");
    }
}
