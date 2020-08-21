/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab22;

/*Synchronized 的使用時機很難定義，比較常見的情況是，
當程式中會取出某一個共用的物件且會判斷物件內容值，
再更新物件內容時，此情況大部分都需要 synchronized 保護。*/
class Account { // 資源物件(帳戶)
    private int money;
    public Account(int money) {
        this.money = money;
    }
    synchronized public  void withdraw(int m) { // 提款
        String tName = Thread.currentThread().getName();
        // 取得帳戶餘額
        int tmpMoney = money;
        //模擬運作時間
        for (int i= 1;i<Integer.MAX_VALUE;i++);
        // 判斷帳戶餘額是否足夠 ?
        if(tmpMoney - m >= 0) {
            money = tmpMoney - m;
            System.out.printf("%s 提款 $%d 成功 餘額 $%d\n", tName, m, money);
        } else {
            System.out.printf("%s 提款 $%d 失敗(餘額不足) 餘額 $%d \n", tName, m, money);
        }
    }
}

class Withdraw implements Runnable { // 提款行為(執行緒)
    private int money;
    private Account account;
    //給他兩個建構子(需要兩個傳入值) int ,Account
    public Withdraw(int money, Account account) {
        this.money = money;
        this.account = account;
    }
    
    @Override
    public void run() {
        account.withdraw(money);
    }
    
}

public class ATM { // 主程式
    public static void main(String[] args) {
        //先創建一個公共資源
        Account account = new Account(10000);
        //接著創建動作
        Withdraw w1 = new Withdraw(5000, account);
        Withdraw w2 = new Withdraw(2000, account);
        Withdraw w3 = new Withdraw(4000, account);
        Thread t1 = new Thread(w1, "小明");
        Thread t2 = new Thread(w2, "小明2");
        Thread t3 = new Thread(w3, "小明3");
        //Withdraw的run會呼叫account的withdraw
        t1.start();
        t2.start();
        t3.start();
    }
}