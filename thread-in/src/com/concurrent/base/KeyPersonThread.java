package com.concurrent.base;

public class KeyPersonThread extends Thread {
	
	public void run(){
		System.out.println(Thread.currentThread().getName()+"Start war!");
		for(int i = 0; i < 10; i++){
			System.out.println(Thread.currentThread().getName() + "Beat Sui");
		}
		System.out.println(Thread.currentThread().getName() + "War finish!");
	}
}
