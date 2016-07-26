package time;

public class SecondsToHMS {
	public synchronized static String hoursMinutesSeconds(int secs){
		int hours = secs / 3600;
		int minutes = (secs%3600) / 60;
		int seconds = secs % 60;
		return "Time: " + hours + "h " + minutes + "min " + seconds + "seconds.";
	}
	public static void main(String[] args){
		int j=0;
		for(int i=0; i<100; i++){
			j++;
		}
		System.out.print(j);
		
	}
	
	synchronized void startThread(){
		Thread thread = new Thread(new MyRunnable());
		hoursMinutesSeconds(30);
		thread.start();
		
	}
	
	private static class MyRunnable implements Runnable{
		@Override
		public void run(){
			
		}
	}
	
	
}



