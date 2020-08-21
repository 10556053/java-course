package com.myjava.java0402.ocp.lab08.power;

import com.myjava.java0402.ocp.lab08.power.interfaces.Price;
import com.myjava.java0402.ocp.lab08.power.interfaces.Device;

public class Phone implements Device ,Price{
 
	/**
	 *@see power.device#getVolt()
	 */
	public int getVolt() {
		return 0;
	}

    @Override
    public int getPower() {
        return 60000;
    }

    @Override
    public int getPrice() {
        return 909099;
    }
	 
}
 
