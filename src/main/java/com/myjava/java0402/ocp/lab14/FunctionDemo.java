/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab14;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * @author student
 */
public class FunctionDemo {
    public static void main(String[] args) {
        
        play(10, t->System.out.println(t));
        //t->System.out.println("t="+t)這一段是一個物件 play會接收到t(accept(x))，並且印出 
        Consumer<Integer> coms = t->System.out.println("我消費"+t);
        play(10, coms);
        
        //Function
        //參數值是一個邏輯
        Function<Integer,Double> function  = t->t*t*3.14;
        System.out.println(play2(50, function));
        
        //predicate
        Predicate<Integer> predicate = t->t>=60? true:false;
        System.out.println(play3(80, predicate));
        
        //supplier
        Supplier<String> supplier =() -> "20.8";
        System.out.println("氣溫"+play4(supplier));
        
        //BiFunction
        BiFunction<Integer, Integer, Double> bf = (h, w) -> w / Math.pow(h/100.0, 2);
        System.out.println(play5(170, 60, bf));
    }
    public static void play ( int x,Consumer consumer ){
        consumer.accept(x);
        
    }
    
    public static Object play2 ( int x,Function function ){
        return function.apply(x);
        
    }
    
    public static boolean play3(int x,Predicate predicate){
        return predicate.test(x);
    } 
    
    public static String  play4(Supplier<String> supplier){
        return supplier.get();
    } 
    
     public static Double play5(Integer h, Integer w, BiFunction<Integer, Integer, Double> biFunction) {
        return biFunction.apply(h, w);
    }
}
