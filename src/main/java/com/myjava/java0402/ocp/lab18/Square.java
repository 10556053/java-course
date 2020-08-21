/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab18;

/**
 *
 * @author student
 */
public class Square {

    public Square() {
        System.out.println("物件開始");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("ˋ見結束");
    }
    
    public int getArea(int x, int y, int h) {
        // 梯形
        int area = (x + y) * h / 2;
        return area;
    }
    
    public int getAngle(int x, int h) {
        // 三角形
        int area = x * h / 2;
        return area;
    }
}
