package com.pair.jsoper;

public class Q12_Robot {
	private int chargerVoltage = 0;
	
	public int getChargerVoltage() {
		System.out.println("running Robot's getChargerVoltage");
		return chargerVoltage;
	}

	public void setChargerVoltage(int chargerVoltage) {
		this.chargerVoltage = chargerVoltage;
	}

	void RobotMethod() {
		System.out.println("Hello from Q12_Robot using Bean inheritance");
	}
}
