/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab13;

/**
 *
 * @author student
 */
public class Stock {
    public String 證券代號;
    public String 證券名稱;
    public String 殖利率;
    public String 股利年度;
    public String 本益比;
    public String 股價淨值比;
    public String 財報年季;

    @Override
    public String toString() {
        return "Stock{" + "\u8b49\u5238\u4ee3\u865f=" + 證券代號 + ", \u8b49\u5238\u540d\u7a31=" + 證券名稱 + ", \u6b96\u5229\u7387=" + 殖利率 + ", \u80a1\u5229\u5e74\u5ea6=" + 股利年度 + ", \u672c\u76ca\u6bd4=" + 本益比 + ", \u80a1\u50f9\u6de8\u503c\u6bd4=" + 股價淨值比 + ", \u8ca1\u5831\u5e74\u5b63=" + 財報年季 + '}';
    }
    
}
