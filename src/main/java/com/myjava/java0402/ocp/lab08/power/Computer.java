package com.myjava.java0402.ocp.lab08.power;

import com.myjava.java0402.ocp.lab08.power.interfaces.Price;
import com.myjava.java0402.ocp.lab08.power.interfaces.Device;

public class Computer implements Device,Price {
 
	/**
	 *@see power.device#getVolt()
	 */
	public int getVolt() {
		return 0;
	}

    @Override
    public int getPower() {
        int power = 35520;
        return power;
    }

    @Override
    public int getPrice() {
        return 89650;
    }
	 
}
 
