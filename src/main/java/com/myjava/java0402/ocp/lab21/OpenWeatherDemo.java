/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab21;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class OpenWeatherDemo {

    static Runnable r = () -> {
        while (true) {
            try {
                //資料來源網址:openWeather
                String path = "https://api.openweathermap.org/data/2.5/weather?q=Tokyo&appid=794612d0a2869ed6b7c78d427133a5fc";
                //將網址資料轉換成jason字串
                String json = new Scanner(new URL(path).openStream()).useDelimiter("\\A").next();
                
                //取得溫度
                JsonObject jo = JsonParser.parseString(json) // 剖析 json 字串
                        .getAsJsonObject() // 取得 json 根物件
                        .get("main") // 取得 main 這個 json 元素
                        .getAsJsonObject();// 得到該元素的 json 物件
                System.out.println(jo.get("temp").getAsDouble() - 273.15);
                //取得
                JsonObject jo2 = JsonParser.parseString(json)
                                       .getAsJsonObject()
                                       .getAsJsonArray("weather")
                                       .get(0)
                                       .getAsJsonObject();
            System.out.println(jo2.get("description").getAsString());
            String icon_url = "http://openweathermap.org/img/wn/%s.png";
            System.out.println(String.format(icon_url, jo2.get("icon").getAsString()));
            } catch (Exception e) {
            }
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }

        }

    };

    public static void main(String[] args) {
        new Thread(r).start();
    }
}
