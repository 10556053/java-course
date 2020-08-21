package com.myjava.java0402.ocp.lab08.power;

import com.myjava.java0402.ocp.lab08.power.interfaces.Price;
import com.myjava.java0402.ocp.lab08.power.interfaces.Car;

public class ToyCar implements Car ,Price{
 
	/**
	 *@see power.Car#speed()
	 */
	public int speed() {
		return 0;
	}

    @Override
    public int getPower() {
        return 900;
    }

    @Override
    public int getPrice() {
        return 885;
    }
	 
}
 
