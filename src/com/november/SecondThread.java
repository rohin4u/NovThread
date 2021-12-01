package com.november;

public class SecondThread extends Thread{
	
	public void run() {
		
		for(int i=0; i<5; i++) {
			
			try {
			 this.sleep(4000);
			System.out.println("in Second Thread");
			}catch(Exception e) 
			{}
		}
	}

}
