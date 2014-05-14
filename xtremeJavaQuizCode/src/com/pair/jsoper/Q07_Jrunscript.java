package com.pair.jsoper;

public class Q07_Jrunscript {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("This class doesn't run anything, it just " +
				"has code to copy and paste");
	}
	
	/*
	Save the code below as file myScript.js, then in a terminal or 
	dos command window, run:
	jrunscript -l js -f myScript.js
	*/


	/*  Sample JavaScript script
	    for executing on a JVM  */

/*
	var a=1;
	var b=false;
	var c=0.0;

	eval('a=a+1');
	eval('b=(a===2)');
	println('a: ' + a);
	println('b: ' + b);

	for (var i=0; i<50000; i++)
	        c=c+1.1;
	println('c: ' + c);

	// functions are first class citizens
	var passFunAndApply = function (fn,x,y,z) { return fn(x,y,z); };
	var sum = function(x,y,z) {
	  return x+y+z;
	};

	var result = passFunAndApply(sum,3,4,5); // 12
	println('result: ' + result);

	date();
*/

}
