package com.pair.jsoper;

public class Q08_NewInterface {

	public static void main(String[] args) {
		new Q08_NewInterface().go();
	}
	void go() {
		FooInterface fi = new FooInterface() {
			@Override
			public void callMe() {
				System.out.println("calling person");
			}
		};
		fi.callMe();
	}
}

interface FooInterface {  
	 public void callMe();  
	}  
