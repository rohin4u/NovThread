package com.interrup;

public class Test {

	public static void main(String[] args) {
		
		FirstThread thread = new FirstThread();
		thread.start();
		thread.interrupt();
		System.out.println("end of the loop");
		
	
	}

}
