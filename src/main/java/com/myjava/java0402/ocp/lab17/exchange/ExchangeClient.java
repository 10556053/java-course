/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab17.exchange;

/**
 *
 * @author student
 */
public class ExchangeClient {
    public static void main(String[] args) {
        System.out.printf("NTD $%.2f\n", new ExchangeService().totalBalance());
    }
}
