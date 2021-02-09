package com.mphasis.training.threaddemos;

class HiThread extends Thread{
	public HiThread(String name) {
		super(name);
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread  "+i+" "+Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class HelloThread extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread Hello "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class ThreadDemo {
	public static void main(String[] args)throws InterruptedException {
		HiThread hi=new HiThread("HI");
		//hi.setName("Hi");
		HelloThread hello=new HelloThread();
		hello.setName("Hello");
		hi.setPriority(Thread.MAX_PRIORITY-1);
		hello.setPriority(Thread.MIN_PRIORITY);
		hi.setDaemon(true);
		hi.start();
		hello.start();
		System.out.println(hi.isDaemon());
		System.out.println(hi.isInterrupted());
		System.out.println(hi.getId()+" "+hello.getId());
		System.out.println(hi.getPriority()+" Priority");
		System.out.println(hello.getPriority()+" Priority");
		System.out.println(hi.isAlive()+" Hi thread live status");
		hi.join();
		hello.join();
		Thread.sleep(500);
		System.out.println(hi.isAlive()+" Hi thread live status");
		System.out.println("Main thread done");
	}

}
