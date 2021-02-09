package com.mphasis.training.threaddemos;

public class ThreadGroupDemo {

	public static void main(String[] args) {
		
		Thread t2=new Thread("Hello");
		
		ThreadGroup tg=new ThreadGroup("message");
		Thread t1=new Thread(tg, "HI");
		//Thread t2=new Thread(group, target, name)

	}

}
