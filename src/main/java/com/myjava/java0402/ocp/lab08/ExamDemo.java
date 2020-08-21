/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab08;

import java.util.Arrays;

/**
 *
 * @author student
 */
public class ExamDemo {
    public static void main(String[] args) {
        //
        int[][] exams = {{100,90},{50,80},{70,100}};
        
        double avg = Arrays.asList(exams)
                .stream()
                .mapToInt(mapper->mapper[0])
                .average()
                .getAsDouble();
        
        System.out.println(avg);
        
        double matAvg = Arrays
                .stream(exams)
                .mapToInt(mapper->mapper[1])
                .average()
                .getAsDouble();
                
        System.out.println(matAvg);
        
        double classAvg = Arrays
                //將exams串流化
                .stream(exams)
                //這邊出來的是每個人的平均資料,e ={100,90} /e={50,80},先取得每個人(e)的平均 : Arrays.stream(e).average().getAsDouble()
                .mapToDouble(e-> Arrays.stream(e).average().getAsDouble())
                //再將得到的人平均拿去平均班平均
                .average()
                //最後取得double值
                .getAsDouble();
        
        System.out.println(classAvg);
        
        //取得班上100分的有幾個
        long cnt100 = Arrays
                //三個一維陣列
                .stream(exams)
                //三個一維振烈 串流成一個長的 一維串流
                .flatMapToInt(e->Arrays.stream(e))
                //此時資料:100,90,50,80...
                //用filter過濾
                .filter(f ->f==100)
                //count會回傳long
                .count();
        
        System.out.println(cnt100);
                
                
        
        
    }
}
