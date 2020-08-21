/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab13;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author student
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(100);
        queue.offer(60);
        queue.offer(90);
        System.out.println(queue);
        
        while(queue.size()>0){
            int n = queue.poll();
            System.err.printf("取出 %s",n);
            
        }
    }
}
