/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab14;

import static com.myjava.java0402.ocp.lab14.FunctionDemo.play;
import static com.myjava.java0402.ocp.lab14.FunctionDemo.play2;
import static com.myjava.java0402.ocp.lab14.FunctionDemo.play3;
import static com.myjava.java0402.ocp.lab14.FunctionDemo.play4;
import static com.myjava.java0402.ocp.lab14.FunctionDemo.play5;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * @author student
 */
public class FunctionDemo2 {
    public static void main(String[] args) {
        
        //t->System.out.println("t="+t)這一段是一個物件 play會接收到t(accept(x))，並且印出 
        Consumer<Integer> coms = t->System.out.println("我消費"+t);
        
        
        //Function
        //參數值是一個邏輯
        Function<Integer,Double> function  = t->t*t*3.14;
        System.out.println(function.apply(50));
        
        //predicate
        Predicate<Integer> predicate = t->t>=60? true:false;
        System.out.println(predicate.test(90));
        
        //supplier
        Supplier<String> supplier =() -> "20.8";
        System.out.println("氣溫"+supplier.get());
        
        //BiFunction
        BiFunction<Integer, Integer, Double> bf = (h, w) -> w / Math.pow(h/100.0, 2);
        System.out.println(bf.apply(190, 80));
        
        //BinaryOperator (extends BiFunction<T,T,T>)
        BinaryOperator<Double> bo = (h,w)->w/Math.pow(h/100, 2 );
        System.out.printf("bmi = %f",bo.apply(170.5, 88.3));
        
    }
}
