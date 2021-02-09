package com.mphasis.training.threaddemos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
class MyTheadCode implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getName());	
	}
	
}

public class ThreadPoolDemo {
	public static void main(String[] args) throws InterruptedException {
	
		ScheduledExecutorService service=
				//Executors.newCachedThreadPool();
				//Executors.newFixedThreadPool(20);
				Executors.newScheduledThreadPool(10);
		for(int i=0;i<10;i++) {
			//service.execute(new MyTheadCode());
			service.schedule(new MyTheadCode(), 20, TimeUnit.MILLISECONDS);
		}
		boolean status= service.isTerminated();
		System.out.println(status+"Status of ThreadPool");
		
		service.awaitTermination(30, TimeUnit.SECONDS);
		service.shutdownNow();
		System.out.println(status+"Status of ThreadPool");
		
	}

}
