package com.pair.jsoper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Q12_RoboticDog extends Q12_Dog {
	private int chargerVoltage = 0;

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"Beans.xml");
		Q12_RoboticDog robodog = (Q12_RoboticDog) ctx.getBean("roboticDogBean");
		robodog.move();
		robodog.bark();
		System.out.println("Charger Voltage: " + robodog.getChargerVoltage());
		
		((ConfigurableApplicationContext) ctx).close();
	}

	@Override
	void bark() {
		System.out.println("machine-sounding woof woof");
	}

	public int getChargerVoltage() {
		System.out.println("running RoboticDog's getChargerVoltage");
		return chargerVoltage;
	}

	public void setChargerVoltage(int chargerVoltage) {
		this.chargerVoltage = chargerVoltage;
	}

}
