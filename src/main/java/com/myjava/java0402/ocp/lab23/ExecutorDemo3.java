/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab23;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author student
 */

class ShortTask implements Runnable{

    @Override
    public void run() {
        System.out.println("短任務完成");
    }
 
}

class LongTask implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println("長任務開始");
            Thread.sleep(5000);
            System.out.println("長任務進行中");
            Thread.sleep(3000);
            System.out.println("長任務結束");
        } catch (Exception e) {
        }
    }

}

public class ExecutorDemo3 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newCachedThreadPool();
        es.submit(new ShortTask());
        es.submit(new ShortTask());
        es.submit(new LongTask());
        es.submit(new LongTask());
        es.submit(new ShortTask());
        es.shutdown(); // 關閉服務
        // 監看任務狀態
        while(!es.awaitTermination(1, TimeUnit.SECONDS)) {
            System.out.println("--- 任務尚未結束 ---");
        }
        System.out.println("所有任務都已經結束");
    }
}
