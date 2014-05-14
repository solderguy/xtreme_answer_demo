package com.pair.jsoper;

import java.io.IOException;
import java.io.RandomAccessFile;

// Example from: 
// http://www.tutorialspoint.com/java/io/randomaccessfile_getfilepointer.htm

public class Q10_Pointers {

	public static void main(String[] args) {
	      try {
	          // create a new RandomAccessFile with filename Example
	          RandomAccessFile raf = new RandomAccessFile("test.txt", "rw");

	          // write something in the file
	          raf.writeUTF("Hello World");

	          // set the file pointer at 0 position
	          raf.seek(0);						// Thar she blows!!!

	          // read and print the contents of the file
	          System.out.println("" + raf.readUTF());

	          // return the file pointer
	          System.out.println("" + raf.getFilePointer()); 

	          // change the position of the file pointer
	          raf.seek(5);

	          // return the file pointer
	          System.out.println("" + raf.getFilePointer());
	          
	          // close to release resources
	          raf.close();
	       } catch (IOException ex) {
	          ex.printStackTrace();
	       }
	}
}
