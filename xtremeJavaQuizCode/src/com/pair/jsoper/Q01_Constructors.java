package com.pair.jsoper;

public class Q01_Constructors {
	public static void main(String[] args) {
		Foo firstFoo = new Foo();
		Foo secondFoo = new Foo(5);
		firstFoo.doNothing();
		secondFoo.doNothing();
	}
}

class Foo {
    Foo(int... ints) {
    	int numArgs = ints.length;
    	System.out.println("\nNumber of arguments: " + numArgs);
    	if (numArgs == 0)
    		System.out.println("Acting as default constructor");
	}
	void doNothing() { ; }  // for removing annoying "not-used" warnings
}


