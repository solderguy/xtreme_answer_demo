package com.pair.jsoper;

public class Q11_Finalizers {

	public static void main(String[] args) {
		new Q11_Finalizers().go();
	}
	
	void go() {
		Peas peas = new Peas();
		peas.askQuestion();
		try {
			peas.finalize();
		} catch (Throwable e1) {
			e1.printStackTrace();
		}
		peas = null;
		System.gc();	// only use in small demo programs
		
		// a little delay might help since above command is only a suggestion
	    try {
	         Thread.sleep(1000);
	    } catch(InterruptedException e) {
	         throw new RuntimeException("Don't know how to handle this", e);
	    }
	}
}

class Vegetables {
	protected void finalize() throws Throwable  
    {  
		System.out.println(" are a vegetable.");
    }  
}

class Peas extends Vegetables {
	protected void finalize() throws Throwable  
    {  
		System.out.print("Peas");
		//super.finalize();
    }  
	void askQuestion() { System.out.println("Are peas a grain?"); }
}

