	package model;
	
	public class Timeout {
		
		public void timeout() {
			try {
				Thread.sleep(4000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		public void timeout1() {
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	}
