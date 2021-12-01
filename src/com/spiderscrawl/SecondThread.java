package com.spiderscrawl;

public class SecondThread extends Thread{
	
	public void run() {
		
		for(int i=0; i<5; i++) {
			
			try {
			 this.sleep(3000);
			System.out.println("in Second Thread");
			}catch(Exception e) 
			{}
		}
	}

}
