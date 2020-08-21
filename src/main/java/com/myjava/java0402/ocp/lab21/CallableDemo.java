/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab21;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 *
 * @author student
 */

class Lotto implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        //等待十秒鐘
        Thread.sleep(10000);
        int n =new  Random().nextInt(100);
        return  n;
    }
    
}
public class CallableDemo {
    public static void main(String[] args) throws Exception{
        Lotto lotto = new Lotto();
        FutureTask<Integer> task = new FutureTask<>(lotto);
        //主執行續呼轎子執行續
        //然後等待
        //等到回傳值後再繼續
        //callable
        new Thread(task).start();
        System.out.println(task.get());
        
                
    }
}
