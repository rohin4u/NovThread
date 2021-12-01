package com.november;

public class FirstThread extends Thread{
	
	public void run(){
		
		SecondThread thread = new SecondThread();
		thread.start();
		
		for(int i=0; i<5; i++) {
			
			try {
				thread.join();
				this.sleep(2000);
				System.out.println("in First Thread");
			}
			catch(Exception e) 
			{
				
			}
		}
	}

}
