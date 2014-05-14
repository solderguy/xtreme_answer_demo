package com.pair.jsoper;

//import java.util.tracking;

public class Q09_TrackingTable {
	int i = 1;

	public static void main(String[] args) {
		new Q09_TrackingTable().go();
	}
	void go() {
		//TrackTable tt = new TrackTable(i);  // initialize to variable
		i++;
		i*=5;
		i--;
		//System.out.println("Number of records: " + tt.size());
		//System.out.println("Time of first change: " + tt.getTimestamp(0));
	}

}
