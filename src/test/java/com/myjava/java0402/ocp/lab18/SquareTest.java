/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab18;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author student
 */
public class SquareTest {
    
    public SquareTest() {
    }

    @Test
    public void testGetArea() {
        System.out.println("getArea");
        //上底
        int x = 3;
        //下底
        int y = 5;
        //高
        int h = 8;
        Square instance = new Square();
        int expResult = 32;
        int result = instance.getArea(x, y, h);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testGetAngle() {
        System.out.println("getAngle");
        //底
        int x = 8;
        //高
        int h = 60;
        Square instance = new Square();
        int expResult = 240;
        int result = instance.getAngle(x, h);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
