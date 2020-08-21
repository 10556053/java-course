package com.myjava.java0402.ocp.lab08.power;

import com.myjava.java0402.ocp.lab08.power.interfaces.Price;
import com.myjava.java0402.ocp.lab08.power.interfaces.Car;

public class Bmw implements Car ,Price{
 
	/**
	 *@see power.Car#speed()
	 */
	public int speed() {
		return 0;
	}

    @Override
    public int getPower() {
           int power = 22000000;
            return power;
    }

    @Override
    public int getPrice() {
        int price = 500000000;
        return price;
    }
	 
}
 
