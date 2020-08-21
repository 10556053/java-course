/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab07;

/**
 *
 * @author student
 */
public class Zoo3 {
    public static void main(String[] args) {
        Tiger t = new Tiger("虎");
        t.hunt("狗");
        t.shout();
        
        //轉型指改變他調用方法的權限，
        //t現在可以調用shout()方法，但
        //執行的還是Tiger類的shout
        ((Cat)t).shout();
        // 此時((Cat)t)不能呼叫Tiger的hunt()
    }
    
}
