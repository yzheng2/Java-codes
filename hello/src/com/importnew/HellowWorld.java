package com.importnew;

public class HellowWorld {
	private String message;
	
	public void setMessage(String message){
		this.message = message;
	}
	
	public String getMessage(){
		return this.message;
	}
	
	public void printMessage(){
		System.out.println("Your Message : " + message);
	}
}
