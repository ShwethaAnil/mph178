package com.mphasis.training.threaddemos;

class MyThread implements Runnable{
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

public class ThreadDemo2 {

	public static void main(String[] args)throws InterruptedException {
		MyThread mThread=new MyThread();
		Thread t1=new Thread(mThread,"Mesaage");
		t1.start();
		t1.join();
		System.out.println("main code done");

	}

}
