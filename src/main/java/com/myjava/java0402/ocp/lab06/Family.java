/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab06;

/**
 *
 * @author student
 */
class Mother{

    public Mother(int x) {
        System.out.println("母親的紅包"+x);
    }
    
}

class Son extends Mother{
    
    //原本extend mather時會自動產生一個隱含的super(此時mother的建構子中沒有傳直)
    //當mother的建構子中需要傳直時，原本隱含的super()便會抱錯
    Son() {
        this(10000);
    }
    Son(int x){
        super(x);
        
    }
    
    

}

public class Family {
    public static void main(String[] args) {
        //繼承方法的調用
        //當有傳直時，就用傳值得值
        //當沒有傳值時，用我們預先給他的10000
        new Son();
        new Son(5000);
    }
}
