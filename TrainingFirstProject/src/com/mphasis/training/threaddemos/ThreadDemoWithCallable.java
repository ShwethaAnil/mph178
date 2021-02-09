package com.mphasis.training.threaddemos;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class MyThreadClass implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "Shwetha";
	}
	
}

public class ThreadDemoWithCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService service=
				Executors.newCachedThreadPool();
				
		//service.
		for(int i=0;i<100;i++) {
			//service.execute(new MyTheadCode());
			Future<String> fut=service.submit(new MyThreadClass());
			System.out.println(fut.get());
			//service.execute(new MyThreadClass());
		}
	}

}
