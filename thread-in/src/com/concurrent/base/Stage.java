package com.concurrent.base;

public class Stage extends Thread {
	
	public void run(){
		
		System.out.println("Welcome!");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("Coming!");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("Let's enjoy the show!");
		
		
		ArmyRunnable armyTaskOfSuiDynasty = new ArmyRunnable();
		ArmyRunnable armyTaskOfRevolt = new ArmyRunnable();
		
		
		Thread armyOfSuiDynasty = new Thread(armyTaskOfSuiDynasty,"Sui");
		Thread armyOfRevolt = new Thread(armyTaskOfRevolt,"Revolt");
		
		armyOfRevolt.start();
		armyOfSuiDynasty.start();
		
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		System.out.println("Keyperson comes");
		
		Thread mrCheng = new KeyPersonThread();
		mrCheng.setName("ChengYaoJin");
		System.out.println("Stop the war by Cheng");
		
		armyTaskOfRevolt.keepRunning = false;
		armyTaskOfSuiDynasty.keepRunning = false;
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mrCheng.start();
		
		try {
			mrCheng.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Cheng Change the world");
		System.out.println("End");
		
	}
	
	public static void main(String[] args){
		new Stage().start();
	}
}
