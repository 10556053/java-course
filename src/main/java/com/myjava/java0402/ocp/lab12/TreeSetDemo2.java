/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab12;

import java.util.IntSummaryStatistics;
import java.util.TreeSet;

/**
 *
 * @author student
 */
public class TreeSetDemo2 {
    public static void main(String[] args) {
        
        //若要可以做調控的話
        //設定一sortFlag
        //sortFlag = 1,成小到大排序
        //sortFlag = -1,成大到小排序
        Exam.sortFlag = 1;
        
        Exam e1 = new Exam("國文",100);
        Exam e2 = new Exam("應文",90);
        Exam e3 = new Exam("數學",80);
        
        TreeSet<Exam> scores = new TreeSet<>();
        scores.add(e1);scores.add(e2);scores.add(e3);
        //必須實作Comparable
        System.out.println(scores);
        
        runViaJava8( scores);
    }

    private static void runViaJava8(TreeSet<Exam> scores) {
        //先把它印出來看看
        scores.stream()
                .forEach(System.out::println);
        
        int sum = scores.stream()
                .map(e->(Exam)e)
                .mapToInt( e->e.getScore() )
                //如果中途想看輸出如何，可以用peek
                //.peek(e->System.out.println(e))
                .sum();
        double avg = scores.stream()
                .map(e->(Exam)e)
                .mapToDouble( e->e.getScore() )
                //如果中途想看輸出如何，可以用peek
                //.peek(e->System.out.println(e))
                .average()
                
                .getAsDouble();
        System.out.println(sum);
        System.out.println(avg);
        
        /*java8步驟
        1.串流
        2.foreach(取得每筆的值)
        3.mapToInt,mapToDouble 轉換
        4.sum(),average()....
        */
        
        //也可以這樣做
        IntSummaryStatistics stat = scores.stream()
                .mapToInt(e->e.getScore())
                .summaryStatistics();
        
        System.out.printf("這是用IntSummaryStatistics方法 :平均為%.2f ,最高分為%d ,最低分為 %d \n",stat.getAverage(),stat.getMax(),stat.getMin());
        
        //取得最高分的科目名稱
        
        String maxSUBJECT = scores.stream()
                .filter(e->e.getScore()==stat.getMax())
                .findFirst()
                .get()
                .getSubject();
                
        System.out.println(maxSUBJECT);
        
        
    }
}
