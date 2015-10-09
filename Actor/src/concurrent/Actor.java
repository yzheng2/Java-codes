package concurrent;

public class Actor extends Thread {
	public void run(){
		System.out.println(getName() + " An actor!");
		int count = 0;
		boolean keepRunning = true;
		while(keepRunning){
		System.out.println(getName() + " Come to stage:" + (++count));

		if(count==100){
			keepRunning = false;
		}
		
		if(count%10==0){
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println(getName() + " finished");
		

		}
	}
	
	public static void main(String[] args){
		Thread actor = new Actor();
		actor.setName("Mr. Thread");
		
		actor.start();
		
		Thread actressThread = new Thread(new Actress(), "Ms. Runnable");
		actressThread.start();
		
	}
}

class Actress implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName() + " An actor!");
		int count = 0;
		boolean keepRunning = true;
		while(keepRunning){
		System.out.println(Thread.currentThread().getName() + " Come to stage:" + (++count));

		if(count==100){
			keepRunning = false;
		}
		
		if(count%10==0){
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println(Thread.currentThread().getName() + " finished");
		

		}
	}
}