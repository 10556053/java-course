/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab23;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Runner implements Runnable {
    //沒有回傳值，直接執行
    @Override
    public void run() {
        System.out.println("Runner");
    }
}

class Caller implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "Caller";
    }
}
public class ExecutorDemo2 {
    public static void main(String[] args) throws Exception {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future f1 = es.submit(new Runner());
        
        Future f2 = es.submit(new Caller());
        //跑到runner時，直接印出runner，沒有回傳值
        //故f1.get()會印出null
        System.out.println(f1.get());
        System.out.println("ive printed first");
        System.out.println(f2.get());
        //如果沒有shutdown就部會結束
        es.shutdown();
    }
}