/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab15;

/**
 *
 * @author student
 */
public class Country {
    String name;
    String region;
 
    public Country(String na, String reg) {
        name = na;
        region = reg;
    }
 
    public String getName() {
        return name;
    }
 
    public String getRegion() {
        return region;
    }

    @Override
    public String toString() {
        return "Country{" + "name=" + name + ", region=" + region + '}';
    }
}
