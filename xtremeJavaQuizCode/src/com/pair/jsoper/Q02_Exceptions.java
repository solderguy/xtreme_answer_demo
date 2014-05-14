package com.pair.jsoper;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Q02_Exceptions {
	Q02_Exceptions() throws FileNotFoundException {
		;
	}
	void Go() throws IOException {
		;
	}
}

class MySubClass extends Q02_Exceptions {
	MySubClass() throws IOException {
		super();
	}
	void Go() throws FileNotFoundException {
		;
	}
}
