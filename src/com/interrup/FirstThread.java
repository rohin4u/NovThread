package com.interrup;

public class FirstThread extends Thread{
	
	public void run(){
		
		for(int i=0; i<5; i++) {
			
			try {
				System.out.println("in First Thread");
				Thread.sleep(2000);
				
			}
			catch(Exception e) 
			{
				System.out.println("in have got interrupted");
		
			}
			
		}
		
	}

}
